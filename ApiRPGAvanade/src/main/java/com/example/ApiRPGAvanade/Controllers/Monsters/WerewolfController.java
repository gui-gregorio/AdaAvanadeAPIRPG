package com.example.ApiRPGAvanade.Controllers.Monsters;

import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.Monsters.WerewolfEntity;
import com.example.ApiRPGAvanade.Services.Monsters.WerewolfService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/characters/werewolf")
@RequiredArgsConstructor


public class WerewolfController {
    private final WerewolfService werewolfService;

    @GetMapping
    @ResponseBody
    public List<WerewolfEntity> getAll(){
        return werewolfService.getAllRecords();
    }

    @PostMapping()
    public WerewolfEntity createWerewolf(@RequestBody CharacterDTO characterDTO){
        return werewolfService.createWerewolf(characterDTO.getName());
    }
}
