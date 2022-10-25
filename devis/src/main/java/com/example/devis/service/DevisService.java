package com.example.devis.service;

import com.example.devis.entity.Devis;

import java.util.List;

public interface DevisService {
    Devis saveDevis(Devis devis);

    List<Devis> fetchDevisList();

    Devis updateDevis(Devis devis, Long devisId);

    void deleteDevisById(Long devisId);
}
