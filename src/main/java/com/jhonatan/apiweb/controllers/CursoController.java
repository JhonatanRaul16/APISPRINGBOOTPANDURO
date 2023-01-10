package com.jhonatan.apiweb.controllers;

import com.jhonatan.apiweb.models.Curso;
import com.jhonatan.apiweb.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {
    @Autowired
    CursoService cursoService;
    @GetMapping
    public ArrayList<Curso> index(){
        return cursoService.index();
    }
    @GetMapping(path="/{id}")
    public Optional<Curso> show(@PathVariable("id") Long id){
        return cursoService.show(id);
    }
    @PostMapping
    public Curso store(@RequestBody Curso curso){
        return cursoService.store(curso);
    }
    @PutMapping(path = "/{id}")
    public Curso  update(@RequestBody Curso curso,@PathVariable("id") Long id){
        return cursoService.update(curso, id);
    }
    @DeleteMapping(path="/{id}")
    public String delete(@PathVariable("id") Long id){
        return cursoService.delete(id);
    }
}
