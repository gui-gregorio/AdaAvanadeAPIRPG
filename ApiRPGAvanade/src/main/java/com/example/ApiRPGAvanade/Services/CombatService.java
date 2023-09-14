package com.example.ApiRPGAvanade.Services;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Entities.CombatEntity;

import java.util.List;

public interface CombatService {
    int calculateAttackValue(CharacterEntity character);
    int calculateDefenseValue(CharacterEntity character);
    int calculateDamage(CharacterEntity attacker, int defenseValue, int attackValue);
    List<CombatEntity> getCombatHistoryForCharacter(Long characterId);
    List<CombatEntity> getCombatHistoryByHeroAndMonster(Long heroId, Long monsterId);

    public CombatEntity simulateCombat(CharacterEntity attacker, CharacterEntity defender);
}