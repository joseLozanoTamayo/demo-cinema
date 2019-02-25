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
import com.parqueadero.application.entity.UsuarioEntity;
import com.parqueadero.application.service.UsuarioService;

@RestController
@RequestMapping(value="/usuario")
@CrossOrigin
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;

	@GetMapping(value = "/ping")
	public String ping() {
		return "hola mundo usuario";
	}

	@GetMapping("/allusuario")
	public List<UsuarioEntity> getAllVehiculos() {
		return usuarioService.getAllUsuario();
	}

	@GetMapping("/{id}")
	public UsuarioEntity getVehiculoId(@PathVariable("id") Long id) {
		return usuarioService.getUsuarioById(id);
	}

	@DeleteMapping("/deleteusuario/{id}")
	public void deleteParking(@PathVariable("id") Long id) {
		usuarioService.deleteUsuario(id);;
		
	}
	
	@PostMapping("/ingreso")
	public UsuarioEntity saveVehiculo(@RequestBody UsuarioEntity registro) {
		
		UsuarioEntity answerDTO = usuarioService.saveOrUpdateUsuario(registro);
		
		return answerDTO;
	}

	
}
