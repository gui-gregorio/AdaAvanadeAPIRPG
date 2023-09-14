package com.example.ApiRPGAvanade.Services;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import com.example.ApiRPGAvanade.Repositories.CharacterRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@AllArgsConstructor
@Service
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    @Override
    public List<CharacterEntity> getAllRecords() {
        return characterRepository.findAll();
    }

    @Override
    public CharacterEntity getById(Long id) {
        return characterRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Character not found with ID: " + id));
    }

    @Override
    public CharacterEntity save(CharacterEntity character) {
        return characterRepository.save(character);
    }

    @Override
    public void deleteCharacter(Long id) {
        if (!characterRepository.existsById(id)) {
            throw new EntityNotFoundException("Character not found with ID: " + id);
        }
        characterRepository.deleteById(id);
    }
}
