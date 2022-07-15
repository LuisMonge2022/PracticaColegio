package com.edu.pe.colegio.servicio;

import java.util.List;

import com.edu.pe.colegio.dto.AulaRequestDTO;
import com.edu.pe.colegio.dto.AulaResponseDTO;

public interface AulaServicio {
	
	public List<AulaResponseDTO> listarAula();
    public AulaResponseDTO obtenerAula(int id);
    public void guardarAula(AulaRequestDTO aula);
    public void actualizarAula(AulaRequestDTO aula);
    public void eliminarAula(int d);

}
