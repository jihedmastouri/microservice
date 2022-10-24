package com.example.Dossier.controller;


import com.example.Dossier.entity.Dossier;
import com.example.Dossier.service.DossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dossier")
public class DossierController {
    @Autowired
    private DossierService dossierService;

    @PostMapping
    public Dossier saveDossier(@RequestBody Dossier dossier){
        return dossierService.saveDossier(dossier);
    }
    @GetMapping
    public List<Dossier> getAllConstat(){
        return dossierService.fetchDossierList();
    }
    @PutMapping("/{id}")
    public Dossier updateDossier(@RequestBody Dossier dossier ,
                                 @PathVariable("id") Long dossierId)
    {
        return dossierService.updateDossier(dossier,dossierId);
    }
    @DeleteMapping("/{id}")
    public String deleteDossier(@PathVariable("id")
                                        Long dossierId)
    {
        dossierService.deleteDossierById(dossierId);
        return "deleted" ;
    }

}
