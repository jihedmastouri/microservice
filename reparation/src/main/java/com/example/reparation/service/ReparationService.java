package com.example.reparation.service;

import com.example.reparation.entity.Reparation;

import java.util.List;

public interface ReparationService {
    // Save operation
    Reparation saveReparation(Reparation reparation);

    // Read operation
    List<Reparation> fetchReparationList();

    // Update operation
    Reparation updateReparation(Reparation reparation, Long reparationId);

    // Delete operation
    void deleteReparationById(Long reparationId);
}
