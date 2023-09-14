package com.example.ApiRPGAvanade.Services.Monsters;
import com.example.ApiRPGAvanade.Entities.Monsters.GiantEntity;
import com.example.ApiRPGAvanade.Repositories.Monsters.GiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GiantServiceImpl implements GiantService{
    private final GiantRepository giantRepository;
    @Override
    public List<GiantEntity> getAllRecords(){
        return giantRepository.findAll();
    }
    @Override
    public GiantEntity createGiant(String name){
        GiantEntity giant = new GiantEntity(name);
        return giantRepository.save(giant);
    }
}

