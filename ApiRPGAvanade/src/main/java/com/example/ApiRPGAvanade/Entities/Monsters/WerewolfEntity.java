package com.example.ApiRPGAvanade.Entities.Monsters;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@DiscriminatorValue("werewolf")


public class WerewolfEntity extends CharacterEntity {
    public WerewolfEntity(String name){
        super(name);
        setHp(34);
        setStr(7);
        setDef(4);
        setAgi(7);
        setDices(2);
        setFaces(4);
    }
}
