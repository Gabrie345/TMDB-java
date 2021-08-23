package com.brq.internet.projetojspbase.viewmodel;

import java.io.Serializable;

public class FilmeViewModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titulo;	
	private double votos;	
	private String dataLancamento;	
	private String tituloOriginal;	
	private String poster;
	private String descricao;
	private String idFilme;
	
	public String getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(String idFilme) {
		this.idFilme = idFilme;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getVotos() {
		return votos;
	}
	public void setVotos(double votos) {
		this.votos = votos;
	}
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLançamento) {
		this.dataLancamento = dataLançamento;
	}
	public String getTituloOriginal() {
		return tituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
