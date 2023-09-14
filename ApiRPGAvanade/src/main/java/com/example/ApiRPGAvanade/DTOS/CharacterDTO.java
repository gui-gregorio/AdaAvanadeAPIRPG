package com.example.ApiRPGAvanade.DTOS;

import lombok.Data;

import java.util.UUID;

@Data

public class CharacterDTO {
    private Long id;
    private UUID playerId;
    private String playerName;
    private String name;
    private Integer hp;
    private Integer str;
    private Integer def;
    private Integer agi;
    private Integer dices;
    private Integer faces;

}
