package com.example.rembour.controller;


import com.example.rembour.entity.Rembour;
import com.example.rembour.service.RembourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rembour")
public class RembourController {
    @Autowired
    private RembourService rembourService;

    @PostMapping
    public Rembour saveRembour(@RequestBody Rembour rembour){
        return rembourService.saveRembour(rembour);
    }
    @GetMapping
    public List<Rembour> getAllConstat(){
        return rembourService.fetchRembourList();
    }
    @PutMapping("/{id}")
    public Rembour updateRembour(@RequestBody Rembour rembour ,
                                 @PathVariable("id") Long rembourId)
    {
        return rembourService.updateRembour(rembour,rembourId);
    }
    @DeleteMapping("/{id}")
    public String deleteRembour(@PathVariable("id")
                                        Long rembourId)
    {
        rembourService.deleteRembourById(rembourId);
        return "deleted" ;
    }

}
