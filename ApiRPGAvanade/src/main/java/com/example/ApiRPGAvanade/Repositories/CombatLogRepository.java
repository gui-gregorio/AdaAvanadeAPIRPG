package com.example.ApiRPGAvanade.Repositories;

import com.example.ApiRPGAvanade.Entities.CombatLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CombatLogRepository extends JpaRepository<CombatLogEntity, Long> {
}