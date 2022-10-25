package com.example.devis.repository;

import com.example.devis.entity.Devis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevisRepo extends JpaRepository<Devis,Long> {
}
