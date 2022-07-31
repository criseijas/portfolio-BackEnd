package com.portfolio.arg_programa.service;

import com.portfolio.arg_programa.model.Persona;
import java.util.List;


public interface IPersonaService {
    //Ver una lista de personas
    public List<Persona> getPersona();
    
    //Crear una persona
    public void savePersona(Persona persona);
    
    //Eliminar una persona por id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}