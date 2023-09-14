package com.example.ApiRPGAvanade.Mappers;


import org.mapstruct.Mapper;

@Mapper
public interface CombatMapper {
    CombatEntityDTO dto = new CombatEntityDTO();
    dto.setId(combatEntity.getId());
    dto.setHeroId(combatEntity.getHero().getId());
    dto.setHeroName(combatEntity.getHero().getName());
    dto.setMonsterId(combatEntity.getMonster().getId());
    dto.setMonsterName(combatEntity.getMonster().getName());
    dto.setInitiator(combatEntity.getInitiator());
    dto.setWinner(combatEntity.getWinner());
    return dto;
}
}
