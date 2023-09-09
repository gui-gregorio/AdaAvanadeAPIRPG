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
    private String name;
    private Integer hp;
    private Integer str;
    private Integer def;
    private Integer agi;
    private Integer dices;
    private Integer faces;

    public CharacterEntity(String name){
        this.name = name;
    }

}
