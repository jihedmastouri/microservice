package com.example.Constats.service;


import com.example.Constats.entity.Constat;
import com.example.Constats.repository.ConstatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ConstatServiceImpl implements ConstatService {

    @Autowired
    private ConstatRepository constatRepository;

    @Override
    public Constat saveConstat(Constat constat) {
        return constatRepository.save(constat);
    }

    @Override
    public List<Constat> fetchConstatList() {
        return (List<Constat>)
                constatRepository.findAll();
    }

    @Override
    public Constat updateConstat(Constat constat, Long constatId) {
            Constat constatDB = constatRepository.findById(constatId).get();
            if(Objects.nonNull(constat)){
                constatDB = constat ;
                constatDB.setConstatId(constatId); 
                return constatRepository.save(constatDB);
            }
            else return null;
    }

    @Override
    public void deleteConstatById(Long constatId) {
        constatRepository.deleteById(constatId);
    }



}
