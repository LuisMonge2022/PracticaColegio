package com.edu.pe.colegio.servicio;

import java.util.List;

import com.edu.pe.colegio.dto.AlumnoRequestDTO;
import com.edu.pe.colegio.dto.AlumnoResponseDTO;

public interface AlumnoServicio {
	
	public List<AlumnoResponseDTO> listarAlumnos();
    public AlumnoResponseDTO obtenerAlumnos(int id);
    public void guardarAlumnos(AlumnoRequestDTO alumno);
    public void actualizarAlumnos(AlumnoRequestDTO alumno);
    public void eliminarAlumnos(int id);

}
