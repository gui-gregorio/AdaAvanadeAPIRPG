package com.example.ApiRPGAvanade.Entities.Heroes;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "knight")
@NoArgsConstructor

class KnightEntity extends CharacterEntity {
    public KnightEntity(String name){
        super(name);
        this.setHp(26);
        this.setStr(6);
        this.setDef(8);
        this.setAgi(3);
        this.setDices(2);
        this.setFaces(6);

    }

}
