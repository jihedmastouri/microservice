package com.example.Dossier.service;

import com.example.Dossier.entity.Dossier;

import java.util.List;

public interface DossierService {

    // Save operation
    Dossier saveDossier(Dossier dossier);

    // Read operation
    List<Dossier> fetchDossierList();

    // Update operation
    Dossier updateDossier(Dossier dossier, Long dossierId);

    // Delete operation
    void deleteDossierById(Long dossierId);

}
