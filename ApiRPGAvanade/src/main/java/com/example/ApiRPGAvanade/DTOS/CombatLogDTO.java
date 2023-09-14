package com.example.ApiRPGAvanade.DTOs;

import lombok.Data;

@Data
public class CombatLogDTO {
    private Long id;
    private Integer turn;
    private String result;
    private Integer attackerHp;
    private Integer defenderHp;
    private Integer attackDice;
    private Integer defenseDice;
    private Integer damageDealt;
    private String attackerName;
    private String defenderName;
}