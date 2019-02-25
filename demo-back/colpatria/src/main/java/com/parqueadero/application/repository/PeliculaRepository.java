package com.parqueadero.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parqueadero.application.entity.PeliculaEntity;

@Repository
public interface PeliculaRepository extends CrudRepository<PeliculaEntity, Long> {

}
