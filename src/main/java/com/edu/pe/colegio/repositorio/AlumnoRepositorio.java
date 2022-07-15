package com.edu.pe.colegio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.pe.colegio.modelo.Alumno;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, Integer> {

}
