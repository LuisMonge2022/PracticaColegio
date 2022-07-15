package com.edu.pe.colegio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoResponseDTO {
	
	private Integer idalumnodto;	
	private String nombredto;
	private String apellidodto;
	private Integer edaddto;

}
