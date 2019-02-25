package com.parqueadero.application.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parqueadero.application.entity.PeliculaEntity;
import com.parqueadero.application.repository.PeliculaRepository;

@Service
public class PeliculaService {

	
	@Autowired
	PeliculaRepository repository;
	
	 public List<PeliculaEntity> getAllPelicula() {
	        List<PeliculaEntity> parks = new ArrayList<PeliculaEntity>();
	        repository.findAll().forEach(parking -> parks.add(parking));
	        return parks;
	    }

	    public PeliculaEntity getPeliculaById(Long id) {
	        return repository.findById(id).get();
	    }

	    public PeliculaEntity saveOrUpdatePelicula(PeliculaEntity usuarioEntity) {
	    	PeliculaEntity park = repository.save(usuarioEntity);
	    	return park;
	    }

	    public void deletePelicula(Long id) {
	    	repository.deleteById(id);
	    }
	
}
