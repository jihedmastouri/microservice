package com.example.Dossier.service;


import com.example.Dossier.entity.Dossier;
import com.example.Dossier.repository.DossierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DossierServiceImpl implements DossierService {

    @Autowired
    private DossierRepository dossierRepository;

    @Override
    public Dossier saveDossier(Dossier dossier) {
        return dossierRepository.save(dossier);
    }

    @Override
    public List<Dossier> fetchDossierList() {
        return (List<Dossier>)
                dossierRepository.findAll();
    }

    @Override
    public Dossier updateDossier(Dossier dossier, Long dossierId) {
        Dossier dossierDB = dossierRepository.findById(dossierId).get();
        if(Objects.nonNull(dossier)){
            dossierDB = dossier ;
            dossierDB.setDossierId(dossierId);
            return dossierRepository.save(dossierDB);
        }
        else return null;
    }

    @Override
    public void deleteDossierById(Long dossierId) {
        dossierRepository.deleteById(dossierId);
    }
}
