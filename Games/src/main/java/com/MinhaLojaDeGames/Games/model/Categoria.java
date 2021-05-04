package com.MinhaLojaDeGames.Games.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	@Size(min = 5, max = 100)
	private String tipo_jogo;
	@NotNull
	private String tipo_empresa;
	@NotNull
	private String descricao;
	@OneToMany(mappedBy = "descricao", cascade = CascadeType.ALL)
	private List<Produto> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo_jogo() {
		return tipo_jogo;
	}

	public void setTipo_jogo(String tipo_jogo) {
		this.tipo_jogo = tipo_jogo;
	}

	public String getTipo_empresa() {
		return tipo_empresa;
	}

	public void setTipo_empresa(String tipo_empresa) {
		this.tipo_empresa = tipo_empresa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
}
