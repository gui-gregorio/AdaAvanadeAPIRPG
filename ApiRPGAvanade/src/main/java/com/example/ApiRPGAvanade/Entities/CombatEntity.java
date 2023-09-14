package com.example.ApiRPGAvanade.Entities;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class CombatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "hero_id")
    private CharacterEntity hero;

    @ManyToOne
    @JoinColumn(name = "monster_id")
    private CharacterEntity monster;

    @OneToMany(mappedBy = "combat", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CombatLogEntity> combatLogs = new ArrayList<>(); // Initialize the list

    @Column(nullable = false)
    private String initiator;

    @Column()
    private String winner;

    public void addCombatLog(CombatLogEntity log) {
        combatLogs.add(log);
        log.setCombat(this);
    }

    public void removeCombatLog(CombatLogEntity log) {
        combatLogs.remove(log);
        log.setCombat(null);
    }
}