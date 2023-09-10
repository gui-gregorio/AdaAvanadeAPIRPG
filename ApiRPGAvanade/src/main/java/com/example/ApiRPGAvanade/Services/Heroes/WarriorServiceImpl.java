package com.example.ApiRPGAvanade.Services.Heroes;

import com.example.ApiRPGAvanade.Entities.Heroes.WarriorEntity;
import com.example.ApiRPGAvanade.Repositories.Heroes.WarriorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class WarriorServiceImpl implements WarriorService {
    private final WarriorRepository warriorRepository;

    @Override
    public List<WarriorEntity> getAllRecords() {
        return warriorRepository.findAll();
    }

    @Override
    public WarriorEntity createWarrior(String name) {
        WarriorEntity warrior = new WarriorEntity(name);
        return  warriorRepository.save(warrior);
    }

}
