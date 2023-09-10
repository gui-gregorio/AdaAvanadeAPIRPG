package com.example.ApiRPGAvanade.Entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "characters")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "character_type")
@NoArgsConstructor

public abstract class CharacterEntity {
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
    @ManyToOne
    @JoinColumn(name = "player_id")
    private PlayerEntity player;

    public CharacterEntity(String name){

        this.name = name;
    }

}
