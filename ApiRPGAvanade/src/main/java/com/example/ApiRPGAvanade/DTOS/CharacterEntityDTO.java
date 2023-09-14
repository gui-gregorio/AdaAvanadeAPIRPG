package com.example.ApiRPGAvanade.DTOS;

import lombok.Data;



@Data
public class CharacterEntityDTO {
    private Long id;
    private String name;
    private Integer hp;
    private Integer str;
    private Integer def;
    private Integer agi;
    private Integer dices;
    private Integer faces;
}