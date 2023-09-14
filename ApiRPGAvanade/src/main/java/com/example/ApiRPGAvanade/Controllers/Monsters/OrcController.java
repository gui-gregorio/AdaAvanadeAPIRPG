package com.example.ApiRPGAvanade.Controllers.Monsters;
import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.Monsters.OrcEntity;
import com.example.ApiRPGAvanade.Services.Monsters.OrcService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/characters/orc")
@RequiredArgsConstructor

public class OrcController {
    private final OrcService orcService;

    @GetMapping
    @ResponseBody
    public List<OrcEntity>getAll(){
        return orcService.getAllRecords();
    }

    @PostMapping()
    public OrcEntity createOrc(@RequestBody CharacterDTO characterDTO){
        return orcService.createOrc(characterDTO.getName());
    }
}
