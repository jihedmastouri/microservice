package com.example.reparation.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reparation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long reparationId;
    private String Client;
    private String Mecanicien;
    private double Cout;
}
