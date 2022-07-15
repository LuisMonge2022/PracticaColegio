package com.edu.pe.colegio.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.pe.colegio.dto.AlumnoRequestDTO;
import com.edu.pe.colegio.dto.AlumnoResponseDTO;
import com.edu.pe.colegio.modelo.Alumno;
import com.edu.pe.colegio.repositorio.AlumnoRepositorio;


@Service
public class AlumnoServicioImpl implements AlumnoServicio {
	
	@Autowired
	public AlumnoRepositorio repositorio;

	@Override
	public List<AlumnoResponseDTO> listarAlumnos() {
		List<AlumnoResponseDTO> lista = new ArrayList<AlumnoResponseDTO>(); 
		
		for (Alumno alumno : repositorio.findAll()) {
            
			AlumnoResponseDTO a = new AlumnoResponseDTO();
			
			a.setIdalumnodto(alumno.getIdalumno());
			a.setNombredto(alumno.getNombre());
			a.setEdaddto(alumno.getEdad());
			a.setApellidodto(alumno.getApellido());          
            lista.add(a);
		
		}
		
		return lista;
	}

	@Override
	public AlumnoResponseDTO obtenerAlumnos(int id) {
			Alumno alumno = repositorio.findById(id).orElse(null);
            
			AlumnoResponseDTO a = new AlumnoResponseDTO();
			
			a.setIdalumnodto(alumno.getIdalumno());
			a.setNombredto(alumno.getNombre());
			a.setEdaddto(alumno.getEdad());
			a.setApellidodto(alumno.getApellido());          
            
		return a;
	}

	@Override
	public void guardarAlumnos(AlumnoRequestDTO alumno) {
		
		Alumno a = new Alumno();		
		
		a.setNombre(alumno.getNombredto());
		a.setEdad(alumno.getEdaddto());
		a.setApellido(alumno.getApellidodto());
		
		repositorio.save(a);
		
	}

	@Override
	public void actualizarAlumnos(AlumnoRequestDTO alumno) {
		
		Alumno a = new Alumno();		
		
		a.setIdalumno(alumno.getIdalumnodto());
		a.setNombre(alumno.getNombredto());
		a.setEdad(alumno.getEdaddto());
		a.setApellido(alumno.getApellidodto());
		
		repositorio.saveAndFlush(a);
		
	}

	@Override
	public void eliminarAlumnos(int id) {
		repositorio.deleteById(id);
		
	}
	
	

}
