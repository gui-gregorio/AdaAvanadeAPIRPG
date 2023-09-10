package com.example.ApiRPGAvanade.Controllers;


import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Services.CharacterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/characters")
@RequiredArgsConstructor
public class CharacterController {
    private final CharacterService characterService;

    @GetMapping()
    @ResponseBody
    public List<CharacterEntity> getCharacters(){
        return characterService.getAllRecords();
    }
}
