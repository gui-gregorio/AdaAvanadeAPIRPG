package com.example.ApiRPGAvanade.Controllers.Monsters;


import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.Monsters.GiantEntity;
import com.example.ApiRPGAvanade.Services.Monsters.GiantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/characters/giant")
@RequiredArgsConstructor

public class GiantController {
    private final GiantService giantService;

    @GetMapping
    @ResponseBody
    public List<GiantEntity>getAll(){
        return giantService.getAllRecords();
    }

    @PostMapping()
    public GiantEntity createGiant(@RequestBody CharacterDTO characterDTO){
        return giantService.createGiant(characterDTO.getName());
    }
}
