package com.example.ApiRPGAvanade.Services.Heroes;

import com.example.ApiRPGAvanade.Entities.Heroes.KnightEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface KnightService {
    List<KnightEntity> getAllRecords();
    KnightEntity createKnight(String name);
    KnightEntity getById(Long id);
}
