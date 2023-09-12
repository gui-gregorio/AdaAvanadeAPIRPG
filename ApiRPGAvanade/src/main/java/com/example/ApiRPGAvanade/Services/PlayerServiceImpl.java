package com.example.ApiRPGAvanade.Services;
import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Entities.PlayerEntity;
import com.example.ApiRPGAvanade.Mappers.CharacterMapper;
import com.example.ApiRPGAvanade.Repositories.CharacterRepository;
import com.example.ApiRPGAvanade.Repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private final PasswordEncoderService passwordEncoderService;
    private final PlayerRepository playerRepository;
    private final CharacterMapper characterMapper;
    private final CharacterRepository characterRepository;

    @Override
    public List<PlayerEntity> getAllRecords(){
        return playerRepository.findAll();
    }

    @Override
    public PlayerEntity savePlayer(PlayerEntity playerEntity, String rawPassword, String name){
        String encodedPassword = passwordEncoderService.encode(rawPassword);
        playerEntity.setHashedPassword(encodedPassword);
        playerEntity.setName(name);
        return playerRepository.save(playerEntity);
    }

    @Override
    public PlayerEntity addCharacter (UUID playerId, CharacterDTO characterDTO){
        PlayerEntity player = playerRepository.findById(playerId).orElseThrow(() -> new RuntimeException("Player not found"));
        CharacterEntity newCharacter = characterMapper.toEntity(characterDTO);
        newCharacter.setPlayer(player);
        player.getCharacters().add(newCharacter);
        characterRepository.save(newCharacter);
        return playerRepository.save(player);
    }

}
