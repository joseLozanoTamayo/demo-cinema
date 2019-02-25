package com.parqueadero.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parqueadero.application.entity.PeliculaEntity;
import com.parqueadero.application.service.PeliculaService;

@RestController
@RequestMapping(value="/pelicula")
@CrossOrigin
public class PeliculaController {
	
	@Autowired
	PeliculaService peliculaService;

	@GetMapping(value = "/ping")
	public String ping() {
		return "hola mundo pelicula";
	}

	@GetMapping("/allusuario")
	public List<PeliculaEntity> getAllVehiculos() {
		return peliculaService.getAllPelicula();
	}

	@GetMapping("/{id}")
	public PeliculaEntity getVehiculoId(@PathVariable("id") Long id) {
		return peliculaService.getPeliculaById(id);
	}

	@DeleteMapping("/deleteusuario/{id}")
	public void deleteParking(@PathVariable("id") Long id) {
		peliculaService.deletePelicula(id);
		
	}
	
	@PostMapping("/ingreso")
	public PeliculaEntity saveVehiculo(@RequestBody PeliculaEntity registro) {
		
		PeliculaEntity answerDTO = peliculaService.saveOrUpdatePelicula(registro);
		
		return answerDTO;
	}
	
}
