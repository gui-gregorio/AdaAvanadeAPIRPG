package com.example.ApiRPGAvanade.Services;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Entities.CombatEntity;
import com.example.ApiRPGAvanade.Entities.CombatLogEntity;
import com.example.ApiRPGAvanade.Repositories.CharacterRepository;
import com.example.ApiRPGAvanade.Repositories.CombatLogRepository;
import com.example.ApiRPGAvanade.Repositories.CombatRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class CombatServiceImpl implements CombatService {
    private final Random random = new Random();
    private final CombatRepository combatRepository;
    private final CharacterRepository characterRepository;
    private final CombatLogRepository combatLogRepository;

    @Override
    public int calculateAttackValue(CharacterEntity character) {
        int diceRoll = random.nextInt(12) + 1;
        return diceRoll + character.getStr() + character.getAgi();
    }
    @Override
    public int calculateDefenseValue(CharacterEntity defender) {
        int diceRoll = random.nextInt(12) + 1;
        return diceRoll + defender.getDef() + defender.getAgi();
    }
    @Override
    public int calculateDamage(CharacterEntity attacker, int defenseValue, int attackValue) {
        if (defenseValue < attackValue) {
            int totalDamageRoll = 0;
            for (int i = 0; i < attacker.getDices(); i++) {
                totalDamageRoll += random.nextInt(attacker.getFaces()) + 1;
            }
            return totalDamageRoll + attacker.getStr();
        }
        return 0;
    }
    @Override
    public List<CombatEntity> getCombatHistoryForCharacter(Long characterId) {
        return combatRepository.findByHeroIdOrMonsterId(characterId, characterId);
    }

    @Override
    public List<CombatEntity> getCombatHistoryByHeroAndMonster(Long heroId, Long monsterId) {
        return combatRepository.findByHeroIdOrMonsterId(heroId, monsterId);
    }

    public CombatEntity simulateCombat(CharacterEntity initiator, CharacterEntity opponent) {
        if (initiator == null || opponent == null) {
            throw new IllegalArgumentException("Initiator and opponent cannot be null.");
        }
        if (initiator.equals(opponent)) {
            throw new IllegalArgumentException("Initiator and opponent cannot be the same entity.");
        }

        CharacterEntity attacker = initiator;
        CharacterEntity defender = opponent;

        int attackValue = calculateAttackValue(attacker);
        int defenseValue = calculateDefenseValue(defender);
        int damage = calculateDamage(attacker, defenseValue, attackValue);

        CombatEntity combatLog = new CombatEntity();
        combatLog.setInitiator(initiator.getName());
        combatLog.setHero(attacker);
        combatLog.setMonster(defender);

        CombatLogEntity combatLogDetail = new CombatLogEntity();
        combatLogDetail.setAttackerName(attacker.getName());
        combatLogDetail.setDefenderName(defender.getName());
        combatLogDetail.setDamageDealt(damage);
        combatLogDetail.setResult(damage > 0 ? "Attack Successful" : "Attack Blocked");

        combatLog.addCombatLog(combatLogDetail);

        combatRepository.save(combatLog);

        return combatLog;
    }

        }


