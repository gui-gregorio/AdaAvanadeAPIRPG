package com.example.ApiRPGAvanade.Services;
import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.PlayerEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface PlayerService {

    List<PlayerEntity>getAllRecords();
    PlayerEntity savePlayer(PlayerEntity playerEntity, String rawPassword, String name);
    PlayerEntity addCharacter(UUID playerId, CharacterDTO characterDTO);
    PlayerEntity getById(UUID id);

}
