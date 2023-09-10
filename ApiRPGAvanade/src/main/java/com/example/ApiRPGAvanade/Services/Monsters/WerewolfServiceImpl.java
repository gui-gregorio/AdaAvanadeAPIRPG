package com.example.ApiRPGAvanade.Services.Monsters;

import com.example.ApiRPGAvanade.Entities.Monsters.WerewolfEntity;
import com.example.ApiRPGAvanade.Repositories.Monsters.WerewolfRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@AllArgsConstructor
public class WerewolfServiceImpl implements WerewolfService{
    private final WerewolfRepository werewolfRepository;

    @Override
    public List<WerewolfEntity> getAllRecords(){
        return werewolfRepository.findAll();
    }

    @Override
    public WerewolfEntity createWerewolf(String name){
        WerewolfEntity werewolf = new WerewolfEntity(name);
        return werewolfRepository.save(werewolf);
    }

    @Override
    public WerewolfEntity getById(Long id){
        return null;
    }
}
