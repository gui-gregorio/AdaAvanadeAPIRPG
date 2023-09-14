package com.example.ApiRPGAvanade.Repositories.Monsters;

import com.example.ApiRPGAvanade.Entities.Monsters.OrcEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrcRepository extends JpaRepository<OrcEntity, Long> {

}
