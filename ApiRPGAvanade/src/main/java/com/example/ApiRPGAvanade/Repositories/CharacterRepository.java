package com.example.ApiRPGAvanade.Repositories;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CharacterRepository extends JpaRepository<CharacterEntity, Long> {
}
