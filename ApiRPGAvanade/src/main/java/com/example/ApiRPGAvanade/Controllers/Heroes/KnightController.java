package com.example.ApiRPGAvanade.Controllers.Heroes;
import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.Heroes.KnightEntity;
import com.example.ApiRPGAvanade.Services.Heroes.KnightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/characters/knight")
@RequiredArgsConstructor

public class KnightController {
    private final KnightService knightService;

    @GetMapping
    @ResponseBody
    public List<KnightEntity> getAll(){
        return knightService.getAllRecords();
    }

    @PostMapping()
    public KnightEntity createKnight(@RequestBody CharacterDTO characterDTO){
        return knightService.createKnight(characterDTO.getName());
    }
}
