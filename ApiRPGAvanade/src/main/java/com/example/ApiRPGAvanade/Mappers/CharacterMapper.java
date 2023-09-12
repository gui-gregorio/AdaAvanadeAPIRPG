package com.example.ApiRPGAvanade.Mappers;

import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface CharacterMapper {
    CharacterEntity toEntity(CharacterDTO dto);
    CharacterDTO toDTO(CharacterEntity entity);
}
