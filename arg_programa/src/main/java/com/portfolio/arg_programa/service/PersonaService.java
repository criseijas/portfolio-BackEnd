package com.portfolio.arg_programa.service;

import com.portfolio.arg_programa.model.Persona;
import com.portfolio.arg_programa.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonaService implements IPersonaService{
    @Autowired 
    public IPersonaRepository persoRepo;
    
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = persoRepo.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        persoRepo.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = persoRepo.findById(id).orElse(null);
        return persona;
    }
    
}