package com.example.ApiRPGAvanade.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CombatLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "combat_id")
    private CombatEntity combat;

    @Column(nullable = false)
    private Integer turn;

    @Column(nullable = false)
    private String result;

    @Column(nullable = false)
    private Integer attackerHp;

    @Column(nullable = false)
    private Integer defenderHp;

    @Column(nullable = false)
    private Integer attackDice;

    @Column(nullable = false)
    private Integer defenseDice;

    @Column(nullable = true)
    private Integer damageDealt;

    @Column()
    private Integer initiativeDice;

    @Column(nullable = false)
    private String attackerName;

    @Column(nullable = false)
    private String defenderName;


}