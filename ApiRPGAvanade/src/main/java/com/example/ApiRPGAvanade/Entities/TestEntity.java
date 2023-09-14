package com.example.ApiRPGAvanade.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="teste")
@Data

public class TestEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

}
