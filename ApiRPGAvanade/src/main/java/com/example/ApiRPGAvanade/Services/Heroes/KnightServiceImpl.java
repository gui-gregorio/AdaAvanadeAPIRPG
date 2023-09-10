package com.example.ApiRPGAvanade.Services.Heroes;
import com.example.ApiRPGAvanade.Entities.Heroes.KnightEntity;
import com.example.ApiRPGAvanade.Repositories.Heroes.KnightRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component

public class KnightServiceImpl implements KnightService {
    private final KnightRepository knightRepository;

    @Override
    public List<KnightEntity> getAllRecords(){
        return knightRepository.findAll();
    }

    @Override
    public KnightEntity createKnight(String name){
        KnightEntity knightEntity = new KnightEntity(name);
        return knightRepository.save(knightEntity);
    }

    @Override
    public KnightEntity getById(Long id){
        return null;
    }
}
