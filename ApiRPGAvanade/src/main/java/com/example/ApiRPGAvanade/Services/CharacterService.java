package com.example.ApiRPGAvanade.Services;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import java.util.List;

public interface CharacterService {

    List<CharacterEntity> getAllRecords();

    CharacterEntity getById(Long id);

    CharacterEntity save(CharacterEntity character);
    void deleteCharacter(Long id);
}