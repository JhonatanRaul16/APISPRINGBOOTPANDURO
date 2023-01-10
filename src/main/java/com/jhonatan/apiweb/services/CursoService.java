package com.jhonatan.apiweb.services;

import com.jhonatan.apiweb.models.Curso;
import com.jhonatan.apiweb.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service

public class CursoService {
    @Autowired
    CursoRepository cursoRepository;
    public ArrayList<Curso> index(){
        return (ArrayList<Curso>) cursoRepository.findAll();
    }
    public Optional<Curso> show(Long id){
        return cursoRepository.findById(id);
    }

    public Curso store(Curso curso){
        return cursoRepository.save(curso);
    }
    public Curso update(Curso request,Long id){
        Curso curso=cursoRepository.findById(id).get();
        curso.setNombre(request.getNombre());
        curso.setSemestre(request.getSemestre());
        curso.setCreditos(request.getCreditos());
        return cursoRepository.save(curso);
    }
    public String delete(Long id){
        try{
            cursoRepository.deleteById(id);
            return "Se elimino correctamente";
        }catch (Exception e){
            return "Error";
        }
    }
}
