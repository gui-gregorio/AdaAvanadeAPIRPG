package com.example.ApiRPGAvanade.Entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "player")
@NoArgsConstructor

public class PlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column(nullable = false)
    private String name;
    @Column (nullable = false)
    private String email;
    @Column (nullable = false)
    private String hashedPassword;
    @Column (nullable = true)
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "player", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<CharacterEntity>characters = new ArrayList<>();
}
