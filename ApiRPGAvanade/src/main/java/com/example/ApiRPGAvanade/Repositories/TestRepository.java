package com.example.ApiRPGAvanade.Repositories;

import com.example.ApiRPGAvanade.Entities.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestEntity, Long> {

}
