package com.example.ApiRPGAvanade.Services;


import com.example.ApiRPGAvanade.Entities.TestEntity;
import com.example.ApiRPGAvanade.Repositories.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    private final TestRepository testRepository;
    @Autowired
    public TestService(TestRepository testRepository){
        this.testRepository = testRepository;
    }

    public List<TestEntity> getAllRecords(){
        return testRepository.findAll();
    }

}
