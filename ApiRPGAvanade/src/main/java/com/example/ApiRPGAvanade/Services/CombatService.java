package com.example.ApiRPGAvanade.Services;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CombatService {
    private final Random random = new Random();

    public int calculateAttackValue(CharacterEntity character) {
        int diceRoll = random.nextInt(12) + 1;
        return diceRoll + character.getStr() + character.getAgi();
    }

    public int calculateDefenseValue(CharacterEntity defender) {
        int diceRoll = random.nextInt(12) + 1;
        return diceRoll + defender.getDef() + defender.getAgi();
    }
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
}


