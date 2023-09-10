package com.example.ApiRPGAvanade.Services.Monsters;
import com.example.ApiRPGAvanade.Entities.Monsters.OrcEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public interface OrcService {
    List<OrcEntity>getAllRecords();
    OrcEntity createOrc(String name);
    OrcEntity getById(Long id);
}
