package com.example.ApiRPGAvanade.DTOS;

import com.example.ApiRPGAvanade.Entities.CharacterEntity;
import lombok.Data;

import java.util.List;

@Data
public class PlayerDTO {
    private String name;
    private String email;
    private String password;

}
