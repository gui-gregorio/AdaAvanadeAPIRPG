package com.example.ApiRPGAvanade.Repositories;

import com.example.ApiRPGAvanade.Entities.CombatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CombatRepository extends JpaRepository<CombatEntity, Long> {

    List<CombatEntity> findByHeroIdOrMonsterId(Long heroId, Long monsterId);
}
