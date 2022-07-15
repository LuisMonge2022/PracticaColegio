package com.edu.pe.colegio.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.pe.colegio.dto.AlumnoRequestDTO;
import com.edu.pe.colegio.dto.AlumnoResponseDTO;
import com.edu.pe.colegio.dto.AulaRequestDTO;
import com.edu.pe.colegio.dto.AulaResponseDTO;
import com.edu.pe.colegio.servicio.AlumnoServicio;
import com.edu.pe.colegio.servicio.AulaServicio;

@Controller
@RequestMapping("/prueba/aula")
public class AulaControlador {

	@Autowired	
    private AulaServicio service;
   

    @GetMapping("/listar")
    public@ResponseBody List<AulaResponseDTO> listarAula() {
        return service.listarAula();
    }

    @GetMapping("/listar/{id}")
    public@ResponseBody AulaResponseDTO obtenerAula(@PathVariable ("id") Integer id ) {
        return service.obtenerAula(id);
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardarAula (@RequestBody AulaRequestDTO aula){
        service.guardarAula(aula);
    }

    @PutMapping("/actualizar")
    public @ResponseBody void actulizarAula (@RequestBody  AulaRequestDTO aula){

        service.actualizarAula(aula);

    }

    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminarAula (@PathVariable ("id") Integer id){
    	
    	service.eliminarAula(id);

    }

}
	

