package com.example.ApiRPGAvanade.Controllers;
import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Mappers.CharacterMapper;
import com.example.ApiRPGAvanade.Services.CharacterServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class CharacterController {
    private final CharacterServiceImpl characterService;
    private final CharacterMapper characterMapper;

    @GetMapping()
    @ResponseBody
    public List<CharacterDTO> getCharacters(){
        List<CharacterEntity> characters = characterService.getAllRecords();
        return characters.stream()
                .map(characterMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CharacterEntity getCharacter(@PathVariable Long id){

        return characterService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCharacter(@PathVariable Long id){
        characterService.deleteCharacter(id);
    }
}
