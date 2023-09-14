package com.example.ApiRPGAvanade.DTOS;
import lombok.Data;
import java.util.List;


@Data
public class PlayerResponseDTO {
    private String name;
    private String email;
    private List<CharacterResponseDTO> characters;

}