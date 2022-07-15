package com.edu.pe.colegio.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.pe.colegio.dto.AulaResponseDTO;
import com.edu.pe.colegio.dto.ColegioRequestDTO;
import com.edu.pe.colegio.dto.ColegioResponseDTO;
import com.edu.pe.colegio.modelo.Aula;
import com.edu.pe.colegio.modelo.Colegio;
import com.edu.pe.colegio.repositorio.ColegioRepositorio;

@Service
public class ColegioServicioImpl implements ColegioServicio {
	
	
	@Autowired
	public ColegioRepositorio repositorio;

	@Override
	public List<ColegioResponseDTO> listarColegio() {
		List<ColegioResponseDTO> lista = new ArrayList<ColegioResponseDTO>(); 
		
		for (Colegio colegio : repositorio.findAll()) {
            
			ColegioResponseDTO c = new ColegioResponseDTO();
			
			c.setIdColegiodto(colegio.getIdColegio());
			c.setLugardto(colegio.getLugar());
			c.setNombreColegiodto(colegio.getNombreColegio());
            lista.add(c);
		
		}
		
		return lista;
	}

	@Override
	public ColegioResponseDTO obtenerColegio(int id) {
		Colegio colegio = repositorio.findById(id).orElse(null);
        
		ColegioResponseDTO c = new ColegioResponseDTO();
		
		c.setIdColegiodto(colegio.getIdColegio());
		c.setLugardto(colegio.getLugar());
		c.setNombreColegiodto(colegio.getNombreColegio());
		
		return c;
	}

	@Override
	public void guardarColegio(ColegioRequestDTO colegio) {
		Colegio c = new Colegio();		
		
		c.setIdColegio(colegio.getIdColegiodto());
		c.setLugar(colegio.getLugardto());	
		c.setNombreColegio(colegio.getNombreColegiodto());
		
		repositorio.save(c);

	}

	@Override
	public void actualizarColegio(ColegioRequestDTO colegio) {
		Colegio c = new Colegio();		
		
		c.setIdColegio(colegio.getIdColegiodto());
		c.setLugar(colegio.getLugardto());	
		c.setNombreColegio(colegio.getNombreColegiodto());
		
		repositorio.saveAndFlush(c);

	}

	@Override
	public void eliminarColegio(int id) {
		repositorio.deleteById(id);

	}

}
