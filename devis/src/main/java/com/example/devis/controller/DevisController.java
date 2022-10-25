package com.example.devis.controller;

import com.example.devis.entity.Devis;
import com.example.devis.service.DevisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devis")
public class DevisController {
    @Autowired
    private DevisService devisService;

    @PostMapping
    public Devis saveDevis(@RequestBody Devis devis){
        return devisService.saveDevis(devis);
    }

    @GetMapping
    public List<Devis> getAllDevis(){
        return devisService.fetchDevisList();
    }

    @PutMapping("/{id}")
    public Devis updateDevis(@RequestBody Devis devis ,
                             @PathVariable("id") Long devisId)
    {
        return devisService.updateDevis(devis,devisId);
    }
    @DeleteMapping("/{id}")
    public String deleteDevis(@PathVariable("id") Long devisId)
    {
        devisService.deleteDevisById(devisId);
        return "deleted" ;
    }

}
