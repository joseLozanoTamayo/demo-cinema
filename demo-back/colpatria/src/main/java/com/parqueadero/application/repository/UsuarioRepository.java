package com.parqueadero.application.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parqueadero.application.entity.UsuarioEntity;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Long>{

}
