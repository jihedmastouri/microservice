package com.example.rembour.service;

import com.example.rembour.entity.Rembour;

import java.util.List;

public interface RembourService {
    // Save operation
    Rembour saveRembour(Rembour rembour);

    // Read operation
    List<Rembour> fetchRembourList();

    // Update operation
    Rembour updateRembour(Rembour rembour, Long rembourId);

    // Delete operation
    void deleteRembourById(Long rembourId);
}
