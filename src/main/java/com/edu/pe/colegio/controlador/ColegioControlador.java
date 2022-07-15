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
import com.edu.pe.colegio.dto.ColegioRequestDTO;
import com.edu.pe.colegio.dto.ColegioResponseDTO;
import com.edu.pe.colegio.servicio.AlumnoServicio;
import com.edu.pe.colegio.servicio.ColegioServicio;

@Controller
@RequestMapping("/prueba/clegio")
public class ColegioControlador {
	
	@Autowired	
    private ColegioServicio service;   
    

    @GetMapping("/listar")
    public@ResponseBody List<ColegioResponseDTO> listarColegio() {
        return service.listarColegio();
    }

    @GetMapping("/listar/{id}")
    public@ResponseBody ColegioResponseDTO obtenerColegio(@PathVariable ("id") Integer id ) {
        return service.obtenerColegio(id);
    }

    @PostMapping("/guardar")
    public @ResponseBody void guardarColegio (@RequestBody ColegioRequestDTO colegio){
        service.guardarColegio(colegio);
    }

    @PutMapping("/actualizar")
    public @ResponseBody void actulizarColegio (@RequestBody  ColegioRequestDTO colegio){

        service.actualizarColegio(colegio);

    }

    @DeleteMapping("/eliminar/{id}")
    public @ResponseBody void eliminarColegio(@PathVariable ("id") Integer id){
    	
    	service.eliminarColegio(id);

    }

}


