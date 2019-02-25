package com.parqueadero.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parqueadero.application.entity.UsuarioEntity;
import com.parqueadero.application.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository repository;
	
	 public List<UsuarioEntity> getAllUsuario() {
	        List<UsuarioEntity> parks = new ArrayList<UsuarioEntity>();
	        repository.findAll().forEach(parking -> parks.add(parking));
	        return parks;
	    }

	    public UsuarioEntity getUsuarioById(Long id) {
	        return repository.findById(id).get();
	    }

	    public UsuarioEntity saveOrUpdateUsuario(UsuarioEntity usuarioEntity) {
	    	UsuarioEntity park = repository.save(usuarioEntity);
	    	return park;
	    }

	    public void deleteUsuario(Long id) {
	    	repository.deleteById(id);
	    }
	
}
