package com.example.devis.service;

import com.example.devis.entity.Devis;
import com.example.devis.repository.DevisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DevisServiceImpl implements DevisService{
   @Autowired
   private DevisRepo devisRepo;
    @Override
    public Devis saveDevis(Devis devis) {
        return devisRepo.save(devis);
    }

    @Override
    public List<Devis> fetchDevisList() {
        return (List<Devis>) devisRepo.findAll();
    }

    @Override
    public Devis updateDevis(Devis devis, Long devisId) {
        Devis devisDB = devisRepo.findById(devisId).get();
        if (Objects.nonNull(devis)){
            devisDB = devis ;
            devisDB.setDevisId(devisId);
            return devisRepo.save(devisDB);
        }
       else return null;
    }

    @Override
    public void deleteDevisById(Long devisId) {
        devisRepo.deleteById(devisId);
    }
}
