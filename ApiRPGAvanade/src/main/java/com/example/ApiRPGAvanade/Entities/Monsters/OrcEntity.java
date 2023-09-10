package com.example.ApiRPGAvanade.Entities.Monsters;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@DiscriminatorValue("orc")


public class OrcEntity extends CharacterEntity {
    public OrcEntity(String name){
        super(name);
        setHp(42);
        setStr(7);
        setDef(1);
        setAgi(2);
        setDices(3);
        setFaces(4);
    }
}
