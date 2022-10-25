package com.example.Collisions.service;


import com.example.Collisions.entity.Collision;
import com.example.Collisions.repository.CollisionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class CollisionServiceImpl implements CollisionService {

    @Autowired
    private CollisionRepo collisionRepo;


    @Override
    public Collision saveCollision(Collision collision) {
        return collisionRepo.save(collision);
    }

    @Override
    public List<Collision> fetchCollisionList() {
        return (List<Collision>) collisionRepo.findAll();
    }

    @Override
    public Collision updateCollision(Collision collision, Long collisionId) {
        Collision collisionDB = collisionRepo.findById(collisionId).get();
        if (Objects.nonNull(collision)){
            collisionDB = collision ;
            collisionDB.setCollisionId(collisionId);
            return collisionRepo.save(collisionDB);
        }
        else return null;
    }

    @Override
    public void deleteCollisionById(Long collisionId) {

        collisionRepo.deleteById(collisionId);
    }
}
