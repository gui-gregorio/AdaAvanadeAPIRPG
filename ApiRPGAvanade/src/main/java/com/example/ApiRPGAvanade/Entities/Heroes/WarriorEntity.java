package com.example.ApiRPGAvanade.Entities.Heroes;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("Warrior")
@NoArgsConstructor

class WarriorEntity extends CharacterEntity{
    public WarriorEntity(String name){
      super(name);
      this.setHp(20);
      this.setStr(7);
      this.setDef(5);
      this.setAgi(6);
      this.setDices(1);
      this.setFaces(12);
  }


}