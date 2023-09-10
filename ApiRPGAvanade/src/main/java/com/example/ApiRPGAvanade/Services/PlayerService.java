package com.example.ApiRPGAvanade.Services;
import com.example.ApiRPGAvanade.Entities.PlayerEntity;
import org.springframework.stereotype.Service;

@Service

public interface PlayerService {
    PlayerEntity savePlayer(PlayerEntity playerEntity, String rawPassword, String name);


}
