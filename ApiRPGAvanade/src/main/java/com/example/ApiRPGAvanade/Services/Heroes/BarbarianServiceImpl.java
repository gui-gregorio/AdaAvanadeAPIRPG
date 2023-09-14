package com.example.ApiRPGAvanade.Services.Heroes;

import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.Heroes.BarbarianEntity;
import com.example.ApiRPGAvanade.Entities.PlayerEntity;
import com.example.ApiRPGAvanade.Repositories.Heroes.BarbarianRepository;
import com.example.ApiRPGAvanade.Services.PlayerService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class BarbarianServiceImpl implements BarbarianService {
    private final BarbarianRepository barbarianRepository;
    private final PlayerService playerService;


    @Override
    public List<BarbarianEntity> getAllRecords(){
        return barbarianRepository.findAll();
    }

    @Override
    public BarbarianEntity createBarbarian(CharacterDTO characterDTO){
        PlayerEntity player = playerService.getById(characterDTO.getPlayerId());
        BarbarianEntity barbarianEntity = new BarbarianEntity(characterDTO.getName());
        barbarianEntity.setPlayer(player);
        return barbarianRepository.save(barbarianEntity);
    }

    @Override
    public BarbarianEntity getById(Long id){

        return barbarianRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Player not found"));
    }




}
