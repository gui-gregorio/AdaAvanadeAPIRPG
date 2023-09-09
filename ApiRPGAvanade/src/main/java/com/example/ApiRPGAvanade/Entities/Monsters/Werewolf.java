package com.example.ApiRPGAvanade.Entities.Monsters;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name="werewolf")
@NoArgsConstructor


class Werewolf extends CharacterEntity {
    public Werewolf(String name){
        super(name);
        setHp(34);
        setStr(7);
        setDef(4);
        setAgi(7);
        setDices(2);
        setFaces(4);
    }
}
