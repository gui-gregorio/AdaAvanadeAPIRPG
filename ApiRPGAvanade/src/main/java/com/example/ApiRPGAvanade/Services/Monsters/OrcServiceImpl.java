package com.example.ApiRPGAvanade.Services.Monsters;
import com.example.ApiRPGAvanade.Entities.Monsters.OrcEntity;
import com.example.ApiRPGAvanade.Repositories.Monsters.OrcRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;

@AllArgsConstructor
@Component

public class OrcServiceImpl implements OrcService {
    private final OrcRepository orcRepository;

    @Override
    public List<OrcEntity> getAllRecords(){
        return orcRepository.findAll();
    }

    @Override
    public OrcEntity createOrc(String name){
        OrcEntity orc = new OrcEntity(name);
        return orcRepository.save(orc);
    }

    @Override
    public OrcEntity getById(Long id){
        return null;
    }
}
