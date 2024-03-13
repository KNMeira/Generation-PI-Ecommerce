package com.generation.alimentai.model;

import org.springframework.format.annotation.NumberFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class ModelUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O nome do usuário é obrigatório!")
	@Size(min = 5, message = "O nome deve ter mais do que 5 caracteres!")
	@Size(max = 255, message = "O nome deve ter menos do que 255 caracteres!")
	private String nomeUsuario;

	@NotBlank(message = "A senha não pode estar vazia")
	@Size(min = 8, message = "A senha deve conter pelo menos 8 caracteres!")
	@Size(max = 32, message = "Essa senha deve ter no máximo 32 caracteres!")
	private String senhaUsuario;

	@NotBlank(message = "O login de usuário não pode estar vazio!")
	@Size(min = 5, message = "O login deve ter pelo menos 5 caracteres!")
	@Size(max = 255, message = "O login deve ter no máximo 255 caracteres!")
	private String loginUsuario;

	@NotNull(message = "")
	@Size(max = 45, message = "O link da foto deve ter no máximo 45 caracteres!") // alimentai/users/1/foto
	private String fotoUsuario;

	@NotNull(message = "É obrigatório definir o tipo do usuário!")
	@Size(max = 45, message = "O tipo de usuário deve ter no máximo 45 caracteres!")
	private String tipoUsuario;

	@NumberFormat
	@PositiveOrZero(message = "A quantidade de produtos postados não pode ser negativa!")
	private Long produtosUsuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public String getLoginUsuario() {
		return loginUsuario;
	}

	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}

	public String getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public Long getProdutosUsuario() {
		return produtosUsuario;
	}

	public void setProdutosUsuario(Long produtosUsuario) {
		this.produtosUsuario = produtosUsuario;
	}
}
