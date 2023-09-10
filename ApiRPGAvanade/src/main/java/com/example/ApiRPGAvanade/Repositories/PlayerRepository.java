package com.example.ApiRPGAvanade.Repositories;

import com.example.ApiRPGAvanade.Entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PlayerRepository extends JpaRepository<PlayerEntity, UUID> {
}
