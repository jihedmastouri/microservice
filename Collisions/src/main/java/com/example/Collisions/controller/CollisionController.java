package com.example.Collisions.controller;


import com.example.Collisions.entity.Collision;
import com.example.Collisions.service.CollisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collision")
public class CollisionController {
    @Autowired
    private CollisionService collisionService;

    @PostMapping
    public Collision saveCollision(@RequestBody Collision collision){
        return collisionService.saveCollision(collision);
    }

    @GetMapping
    public List<Collision> getAllDevis(){
        return collisionService.fetchCollisionList();
    }

    @PutMapping("/{id}")
    public Collision updateCollision(@RequestBody Collision collision ,
                             @PathVariable("id") Long collisionId)
    {
        return collisionService.updateCollision(collision,collisionId);
    }
    @DeleteMapping("/{id}")
    public String deleteCollision(@PathVariable("id") Long collisionId)
    {
        collisionService.deleteCollisionById(collisionId);
        return "deleted" ;
    }
}
