package com.example.ApiRPGAvanade.Mappers;

import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.DTOS.CharacterResponseDTO;
import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CharacterMapper {
    CharacterEntity toEntity(CharacterDTO dto);

    @Mapping(source = "player.id", target = "playerId")
    @Mapping(source = "player.name", target = "playerName")
    CharacterDTO toDTO(CharacterEntity entity);

    CharacterResponseDTO toResponseDTO(CharacterEntity entity); // No special mappings needed here since it's just ID and name
}
