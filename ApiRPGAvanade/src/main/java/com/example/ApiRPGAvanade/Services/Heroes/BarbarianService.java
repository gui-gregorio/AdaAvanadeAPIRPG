package com.example.ApiRPGAvanade.Services.Heroes;
import com.example.ApiRPGAvanade.DTOS.CharacterDTO;
import com.example.ApiRPGAvanade.Entities.Heroes.BarbarianEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BarbarianService {
    List<BarbarianEntity> getAllRecords();
    BarbarianEntity createBarbarian(CharacterDTO characterDTO);
    BarbarianEntity getById(Long id);
}
