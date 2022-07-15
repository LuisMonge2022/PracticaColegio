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
import com.edu.pe.colegio.servicio.AlumnoServicio;

@Controller
@RequestMapping("/prueba/alumno")
public class AlumnoControlador {
	
	@Autowired	
    private AlumnoServicio service;
   

    @GetMapping("/listar")
    public@ResponseBody List<AlumnoResponseDTO> listarAlumnos() {
        return service.listarAlumnos();
    }

    @GetMapping("/listar/{id}")
    public@ResponseBody AlumnoResponseDTO obtenerAlumnos(@PathVariable ("id") Integer id ) {
        return service.obtenerAlumnos(id);
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardarAlumo (@RequestBody AlumnoRequestDTO alumno){
        service.guardarAlumnos(alumno);
    }

    @PutMapping("/actualizar")
    public @ResponseBody void actulizarAlumo (@RequestBody  AlumnoRequestDTO alumno){

        service.actualizarAlumnos(alumno);

    }

    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminarAlumo (@PathVariable ("id") Integer id){
    	
    	service.eliminarAlumnos(id);

    }

}
