package com.yourcompany.time.model;

import javax.persistence.*;

import org.openxava.model.*;

@Entity
public class Time extends  Identifiable {
	
	@Column(length=100)
	private String nome;
	
	@Column(length=100)
	private String presidente;
	
	@Column(length=100)
	private String estado;
	
	@Column(length=20)
	private int torcedores;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPresidente() {
		return presidente;
	}
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getTorcedores() {
		return torcedores;
	}
	public void setTorcedores(int torcedores) {
		this.torcedores = torcedores;
	}
}
