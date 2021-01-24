package com.allanjhonny.cursojavaspringboot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.allanjhonny.cursojavaspringboot.domain.Categoria;
import com.allanjhonny.cursojavaspringboot.repositories.CategoriaRepository;

@SpringBootApplication
public class CursoJavaSpringBootApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoJavaSpringBootApplication.class, args);
	}
	
	
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null,"Informática");
		Categoria cat2 = new Categoria(null,"Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
	}

}
