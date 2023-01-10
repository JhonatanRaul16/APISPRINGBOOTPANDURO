package com.jhonatan.apiweb.repositories;

import com.jhonatan.apiweb.models.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends CrudRepository<Curso,Long> {

}
