package com.example.ApiRPGAvanade.Controllers;
import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Services.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class CharacterController {
    private final CharacterService characterService;

    @GetMapping()
    @ResponseBody
    public List<CharacterEntity> getCharacters(){

        return characterService.getAllRecords();
    }

    @GetMapping("/{id}")
    public CharacterEntity getCharacter(@PathVariable Long id){
        return characterService.getById(id);
    }

}
