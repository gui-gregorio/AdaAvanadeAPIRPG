package com.example.ApiRPGAvanade.Services.Monsters;

import com.example.ApiRPGAvanade.Entities.Monsters.WerewolfEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface WerewolfService {
    List<WerewolfEntity>getAllRecords();
    WerewolfEntity createWerewolf(String name);
    WerewolfEntity getById(Long id);
}
