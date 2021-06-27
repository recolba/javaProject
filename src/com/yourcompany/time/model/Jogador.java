package com.yourcompany.time.model;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;
import org.openxava.model.*;

@Entity
public class Jogador extends Identifiable {
	
	@Column(length=150)
	private String nome;
	
	@Column(length=150)
	private String posição;
	
	@Stereotype("MONEY") 
	private BigDecimal salario;
	
	private boolean titular;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosição() {
		return posição;
	}
	public void setPosição(String posição) {
		this.posição = posição;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public boolean isTitular() {
		return titular;
	}
	public void setTitular(boolean titular) {
		this.titular = titular;
	}
}
