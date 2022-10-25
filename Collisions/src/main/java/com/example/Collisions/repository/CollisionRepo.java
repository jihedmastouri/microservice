package com.example.Collisions.repository;

import com.example.Collisions.entity.Collision;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollisionRepo extends JpaRepository<Collision,Long> {
}
