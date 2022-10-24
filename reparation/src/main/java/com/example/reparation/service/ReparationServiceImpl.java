package com.example.reparation.service;


import com.example.reparation.entity.Reparation;
import com.example.reparation.repository.ReparationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ReparationServiceImpl implements ReparationService {

    @Autowired
    private ReparationRepository reparationRepository;


    @Override
    public Reparation saveReparation(Reparation reparation) {
        return reparationRepository.save(reparation);
    }

    @Override
    public List<Reparation> fetchReparationList() {
        return (List<Reparation>)
                reparationRepository.findAll();
    }

    @Override
    public Reparation updateReparation(Reparation reparation, Long reparationId) {
        Reparation reparationDB = reparationRepository.findById(reparationId).get();
        if(Objects.nonNull(reparation)){
            reparationDB = reparation ;
            reparationDB.setReparationId(reparationId);
            return reparationRepository.save(reparationDB);
        }
        else return null;
    }

    @Override
    public void deleteReparationById(Long reparationId) {
        reparationRepository.deleteById(reparationId);
    }
}
