package com.example.rembour.service;

import com.example.rembour.entity.Rembour;
import com.example.rembour.repository.RembourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class RembourServiceImpl implements RembourService {

    @Autowired
    private RembourRepository rembourRepository;


    @Override
    public Rembour saveRembour(Rembour rembour) {
        return rembourRepository.save(rembour);
    }

    @Override
    public List<Rembour> fetchRembourList() {
        return (List<Rembour>)
                rembourRepository.findAll();
    }

    @Override
    public Rembour updateRembour(Rembour rembour, Long rembourId) {
        Rembour rembourDB = rembourRepository.findById(rembourId).get();
        if(Objects.nonNull(rembour)){
            rembourDB = rembour ;
            rembourDB.setRembourId(rembourId);
            return rembourRepository.save(rembourDB);
        }
        else return null;
    }

    @Override
    public void deleteRembourById(Long rembourId) {
        rembourRepository.deleteById(rembourId);
    }
}
