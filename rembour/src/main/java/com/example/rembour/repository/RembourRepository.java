package com.example.rembour.repository;


import com.example.rembour.entity.Rembour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RembourRepository extends JpaRepository<Rembour, Long> {

}
