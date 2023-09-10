package com.example.ApiRPGAvanade.Controllers.Heroes;

import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.Heroes.WarriorEntity;
import com.example.ApiRPGAvanade.Services.Heroes.WarriorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class WarriorController {
    private final WarriorService warriorService;

    @GetMapping
    @ResponseBody
    public List<WarriorEntity> getAll(){
        return warriorService.getAllRecords();
    }

    @PostMapping()
    public WarriorEntity createWarrior(@RequestBody CharacterDTO characterDTO){
        return warriorService.createWarrior(characterDTO.getName());
    }

}
