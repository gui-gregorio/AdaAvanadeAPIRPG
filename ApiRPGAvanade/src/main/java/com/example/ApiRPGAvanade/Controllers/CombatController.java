package com.example.ApiRPGAvanade.Controllers;


import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Services.CharacterService;
import com.example.ApiRPGAvanade.Services.CombatService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("api/combat")
@RequiredArgsConstructor
public class CombatController {
    private final CombatService combatService;
    private final CharacterService characterService;

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
    
}
