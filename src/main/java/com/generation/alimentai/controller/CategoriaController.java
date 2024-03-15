package com.generation.alimentai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.alimentai.model.ModelCategoria;
import com.generation.alimentai.repository.CategoriaRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/categoria")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@GetMapping
	public ResponseEntity<List<ModelCategoria>> getAll() {
		return ResponseEntity.ok(categoriaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ModelCategoria> getById(@PathVariable Long id) {
		return categoriaRepository.findById(id)
				.map(resposta -> ResponseEntity.ok(resposta))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<ModelCategoria>> getByName(@PathVariable String nome) {
		return ResponseEntity
				.ok(categoriaRepository.findAllByNomeCategoriaContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<ModelCategoria> post(@Valid @RequestBody ModelCategoria modelCategoria) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(categoriaRepository.save(modelCategoria));
	}
	
	@PutMapping
	public ResponseEntity<ModelCategoria> put(@Valid @RequestBody ModelCategoria modelCategoria) {
		
	}
}
