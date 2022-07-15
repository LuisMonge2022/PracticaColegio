package com.edu.pe.colegio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edu.pe.colegio.modelo.Aula;

@Repository
public interface AulaRepositorio extends JpaRepository<Aula, Integer>{

}
