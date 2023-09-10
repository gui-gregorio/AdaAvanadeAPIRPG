package com.example.ApiRPGAvanade.Services.Heroes;
import com.example.ApiRPGAvanade.Entities.Heroes.WarriorEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WarriorService {
    List<WarriorEntity>getAllRecords();
    WarriorEntity createWarrior(String name);
}
