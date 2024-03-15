package com.generation.alimentai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.alimentai.model.ModelCategoria;

@Repository
public interface CategoriaRepository extends JpaRepository<ModelCategoria, Long> {
	public List<ModelCategoria> findAllByNomeCategoriaContainingIgnoreCase(@Param("nomeProduto") String nomeProduto);
}
