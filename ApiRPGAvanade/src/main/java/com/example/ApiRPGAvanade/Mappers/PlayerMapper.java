package com.example.ApiRPGAvanade.Mappers;
import com.example.ApiRPGAvanade.DTOS.PlayerCreateDTO;
import com.example.ApiRPGAvanade.DTOS.PlayerResponseDTO;
import com.example.ApiRPGAvanade.Entities.PlayerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    PlayerEntity toEntity(PlayerCreateDTO dto);
    PlayerCreateDTO toDTO(PlayerEntity entity);
    PlayerResponseDTO toResponseDTO(PlayerEntity entity);

}
