package com.example.ApiRPGAvanade.Services;


import com.example.ApiRPGAvanade.Entities.PlayerEntity;
import com.example.ApiRPGAvanade.Repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {
    private PasswordEncoderService passwordEncoderService;
    private PlayerRepository playerRepository;

    @Override
    public PlayerEntity savePlayer(PlayerEntity playerEntity, String rawPassword, String name){
        String encodedPassword = passwordEncoderService.encode(rawPassword);
        playerEntity.setHashedPassword(encodedPassword);
        playerEntity.setName(name);
        return playerRepository.save(playerEntity);
    }

}
