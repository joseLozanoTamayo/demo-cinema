package com.parqueadero.application;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.parqueadero.application.entity.UsuarioEntity;
import com.parqueadero.application.repository.UsuarioRepository;


@SpringBootApplication
public class Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}
	
	@Bean
	public CommandLineRunner parametroInicial(UsuarioRepository repository) {
		return (args) -> {
			UsuarioEntity usuario = new UsuarioEntity();
			usuario.setIdUsuario(Long.parseLong("1"));
			usuario.setNombres("admin");
			usuario.setApellidos("admin");
			usuario.setEmail("admin@admin.com");
			usuario.setPassword("admin");
			usuario.setTelefono("5555555");
			usuario.setUserName("admin");
			repository.save(usuario);
		};
	}

}

