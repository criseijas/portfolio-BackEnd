package com.portfolio.arg_programa.repository;

import com.portfolio.arg_programa.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}