package com.example.ApiRPGAvanade.Services.Monsters;
import com.example.ApiRPGAvanade.Entities.Monsters.GiantEntity;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface GiantService {
    List<GiantEntity>getAllRecords();
    GiantEntity createGiant(String name);

}
