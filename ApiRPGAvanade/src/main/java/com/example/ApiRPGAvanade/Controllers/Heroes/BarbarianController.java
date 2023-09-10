package com.example.ApiRPGAvanade.Controllers.Heroes;

import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.Heroes.BarbarianEntity;
import com.example.ApiRPGAvanade.Services.Heroes.BarbarianService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/characters/barbarian")
@RequiredArgsConstructor

public class BarbarianController {
    private final BarbarianService barbarianService;

    @GetMapping
    @ResponseBody
    public List<BarbarianEntity>getAll(){
        return barbarianService.getAllRecords();
    }

    @PostMapping()
    public BarbarianEntity createBarbarian(@RequestBody CharacterDTO characterDTO){
        return barbarianService.createBarbarian(characterDTO.getName());
    }
}
