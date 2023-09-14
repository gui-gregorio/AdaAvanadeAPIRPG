package com.example.ApiRPGAvanade.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Data
@Table(name = "characters")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "character_type")
@NoArgsConstructor

public class CharacterEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer hp;
    @Column(nullable = false)
    private Integer str;
    @Column(nullable = false)
    private Integer def;
    @Column(nullable = false)
    private Integer agi;
    @Column(nullable = false)
    private Integer dices;
    @Column(nullable = false)
    private Integer faces;
    @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL)
    private List<CombatEntity> heroCombats;
    @OneToMany(mappedBy = "monster", cascade = CascadeType.ALL)
    private List<CombatEntity> monsterCombats;
    @ManyToOne
    @JoinColumn(name = "player_id")
    @JsonBackReference
    private PlayerEntity player;
    public CharacterEntity(String name){

        this.name = name;
    }

}
