package com.example.ApiRPGAvanade.Controllers;

import com.example.ApiRPGAvanade.Entities.TestEntity;
import com.example.ApiRPGAvanade.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/test")

public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }

    @GetMapping("/getAllRecords")
    public List<TestEntity> getAllTestRecords(){
        return testService.getAllRecords();
    }
}
