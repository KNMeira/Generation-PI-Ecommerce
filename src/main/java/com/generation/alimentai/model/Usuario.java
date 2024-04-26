package com.generation.alimentai.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O nome de usuario não pode estar vazio!")
	@Size(max = 100, message = "O nome de usuario precisa ser menor 50 caracteres!")
	private String nome;
	
	@Schema(example = "email@email.com.br")
	@NotBlank(message = "O email de usuário não pode estar vazio!")
	@Email(message = "Insira um endereço de e-mail válido!")
	@Size(min = 5, message = "O email deve ter pelo menos 5 caracteres!")
	@Size(max = 255, message = "O email deve ter no máximo 255 caracteres!")
	private String email;
	
	@NotBlank(message = "A senha do usuário não pode estar vazio!")
	@Size(min = 8, message = "A senha precisa ter no minimo 8 caracteres!")
	private String senha;

	@Size(max = 45, message = "O link da foto deve ter no máximo 45 caracteres!") 
	private String foto;
	
	@NotNull(message = "O tipo de usuário não pode estar vazio!")
	@Enumerated(EnumType.STRING)
	private UserType tipo;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Produto> produtos;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}

	public UserType getTipo() {
		return tipo;
	}
	
	public void setTipo(UserType tipo) {
		this.tipo = tipo;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public enum UserType {
		consumidor,
		produtor,
		administrador
	}
}
