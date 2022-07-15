package com.edu.pe.colegio.servicio;

import java.util.List;

import com.edu.pe.colegio.dto.ColegioRequestDTO;
import com.edu.pe.colegio.dto.ColegioResponseDTO;

public interface ColegioServicio {
	
	public List<ColegioResponseDTO> listarColegio();
    public ColegioResponseDTO obtenerColegio(int id);
    public void guardarColegio(ColegioRequestDTO colegio);
    public void actualizarColegio(ColegioRequestDTO colegio);
    public void eliminarColegio(int id);

}
