package com.example.ApiRPGAvanade.Entities.Monsters;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "giant")
@NoArgsConstructor

class GiantEntity extends CharacterEntity {
    public GiantEntity(String name){
        super(name);
        this.setHp(34);
        this.setStr(10);
        this.setDef(4);
        this.setAgi(4);
        this.setDices(2);
        this.setFaces(6);
    }


}
