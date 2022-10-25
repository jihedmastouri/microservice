package com.example.Collisions.service;

import com.example.Collisions.entity.Collision;

import java.util.List;

public interface CollisionService {

    Collision saveCollision(Collision collision);

    List<Collision> fetchCollisionList();

    Collision updateCollision(Collision collision, Long collisionId);

    void deleteCollisionById(Long collisionId);
}
