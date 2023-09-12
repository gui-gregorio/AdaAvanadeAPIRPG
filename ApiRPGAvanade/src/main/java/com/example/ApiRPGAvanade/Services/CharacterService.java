package com.example.ApiRPGAvanade.Services;


import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Repositories.CharacterRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class CharacterService {
    private final CharacterRepository characterRepository;

    public List<CharacterEntity>getAllRecords(){

        return characterRepository.findAll();
    }

    public CharacterEntity getById(Long id){
        return characterRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Character not found with ID: " + id));
    }

}
