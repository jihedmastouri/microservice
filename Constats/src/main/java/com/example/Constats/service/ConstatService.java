package com.example.Constats.service;

import com.example.Constats.entity.Constat;

import java.util.List;

public interface ConstatService {
    // Save operation
    Constat saveConstat(Constat constat);

    // Read operation
    List<Constat> fetchConstatList();

    // Update operation
    Constat updateConstat(Constat constat, Long constatId);

    // Delete operation
    void deleteConstatById(Long constatId);

}
