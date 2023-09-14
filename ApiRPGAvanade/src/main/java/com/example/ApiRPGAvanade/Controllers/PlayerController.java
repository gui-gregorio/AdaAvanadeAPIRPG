package com.example.ApiRPGAvanade.Controllers;


import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.DTOS.PlayerCreateDTO;
import com.example.ApiRPGAvanade.DTOS.PlayerResponseDTO;
import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Entities.PlayerEntity;
import com.example.ApiRPGAvanade.Mappers.PlayerMapper;
import com.example.ApiRPGAvanade.Services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/players")
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;
    private final PlayerMapper playerMapper;

    @GetMapping()
    public List<PlayerResponseDTO> getPlayers(){
        List<PlayerEntity> players = playerService.getAllRecords();
        return players.stream()
                .map(playerMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @PostMapping()
    public PlayerCreateDTO createPlayer(@RequestBody PlayerCreateDTO playerCreateDTO){
        PlayerEntity playerEntity = playerMapper.toEntity(playerCreateDTO);
        PlayerEntity savedEntity = playerService.savePlayer(playerEntity, playerCreateDTO.getPassword(), playerCreateDTO.getName());
        return playerMapper.toDTO(savedEntity);
    }

    @PatchMapping("{playerId}")
    public PlayerCreateDTO addCharacter(@PathVariable UUID playerId, @RequestBody CharacterDTO characterDTO){
        PlayerEntity updatedPlayer = playerService.addCharacter(playerId, characterDTO);
        return playerMapper.toDTO(updatedPlayer);
    }

}
