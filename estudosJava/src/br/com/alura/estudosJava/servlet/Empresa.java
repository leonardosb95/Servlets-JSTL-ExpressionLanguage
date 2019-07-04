package br.com.alura.estudosJava.servlet;

import java.util.Date;

public class Empresa {

	private Integer id;
	private String nome;
	private Date dataAbertura= new Date();
	
	public void setData(Date data) {
		this.dataAbertura = data;
	}
	
	public Date getData() {
		return dataAbertura;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
