package com.edu.pe.colegio.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.pe.colegio.dto.AulaRequestDTO;
import com.edu.pe.colegio.dto.AulaResponseDTO;
import com.edu.pe.colegio.modelo.Aula;
import com.edu.pe.colegio.repositorio.AulaRepositorio;

@Service
public class AulaServicioImpl implements AulaServicio {
	
	
	@Autowired
	public AulaRepositorio repositorio;

	@Override
	public List<AulaResponseDTO> listarAula() {
		List<AulaResponseDTO> lista = new ArrayList<AulaResponseDTO>(); 
		
		for (Aula aula : repositorio.findAll()) {
            
			AulaResponseDTO a = new AulaResponseDTO();
			
			a.setIdauladto(aula.getIdaula());
			a.setNumeroauladto(aula.getNumeroaula());			         
            lista.add(a);
		
		}
		
		return lista;
	}

	@Override
	public AulaResponseDTO obtenerAula(int id) {
		Aula aula = repositorio.findById(id).orElse(null);
        
		AulaResponseDTO a = new AulaResponseDTO();
		
		a.setIdauladto(aula.getIdaula());
		a.setNumeroauladto(aula.getNumeroaula());
		
		return a;
		 
	}

	@Override
	public void guardarAula(AulaRequestDTO aula) {
		Aula a = new Aula();		
		
		a.setIdaula(aula.getIdauladto());
		a.setNumeroaula(aula.getNumeroauladto());		
		
		repositorio.save(a);

	}

	@Override
	public void actualizarAula(AulaRequestDTO aula) {
		Aula a = new Aula();		
		
		a.setIdaula(aula.getIdauladto());
		a.setNumeroaula(aula.getNumeroauladto());		
		
		repositorio.saveAndFlush(a);

	}

	@Override
	public void eliminarAula(int id) {
		repositorio.deleteById(id);

	}

}
