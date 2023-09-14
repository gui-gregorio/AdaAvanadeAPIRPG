package com.example.ApiRPGAvanade.Controllers;


import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Entities.CombatEntity;
import com.example.ApiRPGAvanade.Entities.CombatLogEntity;
import com.example.ApiRPGAvanade.Repositories.CharacterRepository;
import com.example.ApiRPGAvanade.Repositories.CombatRepository;
import com.example.ApiRPGAvanade.Services.CharacterServiceImpl;
import com.example.ApiRPGAvanade.Services.CombatServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/combat")
@RequiredArgsConstructor
public class CombatController {
    private final CombatServiceImpl combatService;
    private final CharacterServiceImpl characterService;
    private final CombatRepository combatRepository;
    private final CharacterRepository characterRepository;
    @GetMapping("{characterId}/history")
    public ResponseEntity<List<CombatEntity>> getHistory(@PathVariable Long characterId){
        List<CombatEntity> combatHistory = combatService.getCombatHistoryForCharacter(characterId);
        return ResponseEntity.ok(combatHistory);

    }

    @GetMapping("{characterId}/attack")
    public ResponseEntity<Integer> getAttack(@PathVariable Long characterId){
        CharacterEntity character = characterService.getById(characterId);
        int attackValue = combatService.calculateAttackValue(character);
        return ResponseEntity.ok(attackValue);
    }
    @GetMapping("{characterId}/defense")
    public ResponseEntity<Integer> getDefense(@PathVariable Long characterId){
        CharacterEntity character = characterService.getById(characterId);
        int defenseValue = combatService.calculateDefenseValue(character);
        return ResponseEntity.ok(defenseValue);
    }
    @PostMapping("{attackerId}/{defenderId}")
    public CombatEntity simulateCombat(@PathVariable Long attackerId, @PathVariable Long defenderId)  {
        CharacterEntity initiator = characterRepository.findById(attackerId).orElseThrow(() -> new IllegalArgumentException("Initiator not found"));
        CharacterEntity opponent = characterRepository.findById(defenderId).orElseThrow(() -> new IllegalArgumentException("Opponent not found"));
        if (initiator == null || opponent == null) {
            throw new IllegalArgumentException("Initiator and opponent cannot be null.");
        }
        if (initiator.equals(opponent)) {
            throw new IllegalArgumentException("Initiator and opponent cannot be the same entity.");
        }

        CharacterEntity attacker = initiator;
        CharacterEntity defender = opponent;

        int attackValue = combatService.calculateAttackValue(attacker);
        int defenseValue = combatService.calculateDefenseValue(defender);
        int damage = combatService.calculateDamage(attacker, defenseValue, attackValue);
        int attackerHPAfterAttack = attacker.getHp() - (damage > 0 ? damage : 0);
        int defenderHPAfterAttack = defender.getHp() - damage;

        CombatEntity combatLog = new CombatEntity();
        combatLog.setInitiator(initiator.getName());
        combatLog.setHero(attacker);
        combatLog.setMonster(defender);

        CombatLogEntity combatLogDetail = new CombatLogEntity();
        combatLogDetail.setAttackerName(attacker.getName());
        combatLogDetail.setDefenderName(defender.getName());
        combatLogDetail.setDamageDealt(damage);
        combatLogDetail.setResult(damage > 0 ? "Attack Successful" : "Attack Blocked");
        combatLogDetail.setAttackDice(attackValue);  // Setting the attack value as attackDice
        combatLogDetail.setDefenseDice(defenseValue);  // Setting the defense value as defenseDice
        combatLogDetail.setAttackerHp(attackerHPAfterAttack);
        combatLogDetail.setDefenderHp(defenderHPAfterAttack);
        combatLogDetail.setTurn(1);

        combatLog.addCombatLog(combatLogDetail);

        combatRepository.save(combatLog);

        return combatLog;
    }
}

