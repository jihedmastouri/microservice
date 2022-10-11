package com.example.Constats.repository;


import com.example.Constats.entity.Constat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstatRepository extends JpaRepository<Constat, Long> {

}
