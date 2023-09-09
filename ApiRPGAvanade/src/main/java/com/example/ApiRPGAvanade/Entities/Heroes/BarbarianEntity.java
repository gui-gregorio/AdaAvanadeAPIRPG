package com.example.ApiRPGAvanade.Entities.Heroes;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "barbarian")
@NoArgsConstructor

class BarbarianEntity extends CharacterEntity {
   public BarbarianEntity(String name){
       super(name);
       this.setHp(21);
       this.setStr(10);
       this.setDef(2);
       this.setAgi(5);
       this.setDices(2);
       this.setFaces(8);


   }

}
