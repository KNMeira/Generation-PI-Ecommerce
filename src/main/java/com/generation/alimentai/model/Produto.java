package com.generation.alimentai.model;

import org.springframework.format.annotation.NumberFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O nome do produto não pode estar vazio!")
	@Size(min = 5, message = "O nome precisa ter mais do que 5 caracteres!")
	@Size(max = 45, message = "O nome precisa ter menos do que 45 caracteres!")
	private String nome;

	@NotBlank(message = "A descrição do produto não pode estar vazia!")
	@Size(min = 10, message = "A descrição do produto precisa ter mais do que 10 caracteres!")
	@Size(max = 255, message = "A descrição é muito grande! Precisa ter menos de 255 caracteres!")
	private String descricao;

	@NotNull(message = "O valor do produto não pode estar vazio!")
	@NumberFormat(pattern = "#,###.##")
	@Positive(message = "O valor do produto deve ser um número positivo!")
	@Column(columnDefinition = "decimal(6,2)")
	private Float preco;

	@NotNull(message = "A quantidade de estoque não pode estar vazia!")
	@PositiveOrZero(message = "A quantidade em estoque deve ser um número positivo!")
	private Integer quantidade;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
