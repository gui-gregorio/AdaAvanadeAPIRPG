package com.example.ApiRPGAvanade.Controllers;


import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.DTOS.PlayerDTO;
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
    public List<PlayerDTO> getPlayers(){
        List<PlayerEntity> players = playerService.getAllRecords();
        return players.stream().map(playerMapper::toDTO)
                .collect(Collectors.toList());
    }

    @PostMapping()
    public PlayerDTO createPlayer(@RequestBody PlayerDTO playerDTO){
        PlayerEntity playerEntity = playerMapper.toEntity(playerDTO);
        PlayerEntity savedEntity = playerService.savePlayer(playerEntity, playerDTO.getPassword(), playerDTO.getName());
        return playerMapper.toDTO(savedEntity);
    }

    @PatchMapping("{playerId}")
    public PlayerDTO addCharacter(@PathVariable UUID playerId, @RequestBody CharacterDTO characterDTO){
        PlayerEntity updatedPlayer = playerService.addCharacter(playerId, characterDTO);
        return playerMapper.toDTO(updatedPlayer);
    }

}
