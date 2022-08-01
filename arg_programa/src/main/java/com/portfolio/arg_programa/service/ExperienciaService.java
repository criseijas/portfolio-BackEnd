package com.portfolio.arg_programa.service;

import com.portfolio.arg_programa.model.Experiencia;
import com.portfolio.arg_programa.repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {

    @Autowired

    public IExperienciaRepository expeRepo;

    //Traemos una lista de experiencias
    public List<Experiencia> lista() {
        return expeRepo.findAll();
    }

    //Trae una experiencia por el id
    public Optional<Experiencia> getOne(int id) {
        return expeRepo.findById(id);
    }

    //Trae una experiencia por el nombre
    public Optional<Experiencia> getByNombreExp(String nombreExp) {
        return expeRepo.findByNombreExp(nombreExp);
    }

    //Crea una experiencia
    public void save(Experiencia expe) {
        expeRepo.save(expe);
    }

    //Borra una experiencia por id
    public void delete(int id) {
        expeRepo.deleteById(id);
    }

    //Chequear si existe el id que se pasa por parámetro
    public boolean existsById(int id) {
        return expeRepo.existsById(id);
    }

    //Chequear si existe el nombre de la experiencia que se pasa
    public boolean existsByNombreExp(String nombreExp) {
        return expeRepo.existsByNombreExp(nombreExp);
    }

}
