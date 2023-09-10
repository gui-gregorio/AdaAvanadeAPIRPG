package com.example.ApiRPGAvanade.Services.Heroes;

import com.example.ApiRPGAvanade.Entities.Heroes.BarbarianEntity;
import com.example.ApiRPGAvanade.Repositories.Heroes.BarbarianRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Component
public class BarbarianServiceImpl implements BarbarianService {
    private final BarbarianRepository barbarianRepository;

    @Override
    public List<BarbarianEntity> getAllRecords(){
        return barbarianRepository.findAll();
    }

    @Override
    public BarbarianEntity createBarbarian(String name){
        BarbarianEntity barbarianEntity = new BarbarianEntity(name);
        return barbarianRepository.save(barbarianEntity);
    }

    @Override
    public BarbarianEntity getById(Long id){
        return null;
    }




}
