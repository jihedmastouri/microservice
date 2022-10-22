package com.example.Collisions.entity;


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
public class Collision {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long collisionId;
    private String typeCollision;
    private String descriptionCollision;
    private String client;
}
