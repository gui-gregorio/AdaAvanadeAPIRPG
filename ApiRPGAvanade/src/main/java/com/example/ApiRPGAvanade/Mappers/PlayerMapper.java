package com.example.ApiRPGAvanade.Mappers;
import com.example.ApiRPGAvanade.DTOS.PlayerDTO;
import com.example.ApiRPGAvanade.Entities.PlayerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlayerMapper {
    PlayerEntity toEntity(PlayerDTO dto);
    PlayerDTO toDTO(PlayerEntity entity);

}
