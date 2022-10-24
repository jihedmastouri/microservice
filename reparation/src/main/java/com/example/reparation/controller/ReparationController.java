package com.example.reparation.controller;


import com.example.reparation.entity.Reparation;
import com.example.reparation.service.ReparationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reparation")
public class ReparationController {
    @Autowired
    private ReparationService reparationService;

    @PostMapping
    public Reparation saveReparation(@RequestBody Reparation reparation){
        return reparationService.saveReparation(reparation);
    }
    @GetMapping
    public List<Reparation> getAllReparation(){
        return reparationService.fetchReparationList();
    }
    @PutMapping("/{id}")
    public Reparation updateReparation(@RequestBody Reparation reparation ,
                                 @PathVariable("id") Long reparationId)
    {
        return reparationService.updateReparation(reparation,reparationId);
    }
    @DeleteMapping("/{id}")
    public String deleteReparation(@PathVariable("id")
                                        Long reparationId)
    {
        reparationService.deleteReparationById(reparationId);
        return "deleted" ;
    }

}
