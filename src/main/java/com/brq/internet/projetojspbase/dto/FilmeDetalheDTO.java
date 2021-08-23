package com.brq.internet.projetojspbase.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//Recebe o retorn do metodo dentro de Service (readEntity) Data Transfer Object

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmeDetalheDTO {

	@JsonProperty("title") 
	private String Titulo;
	@JsonProperty("vote_average") 
	private double votos;
	@JsonProperty("release_date") 
	private String dataLancamento;
	@JsonProperty("original_title") 
	private String tituloOriginal;
	@JsonProperty("poster_path") 
	private String poster;
	@JsonProperty("overview")
	private String descricao;
	@JsonProperty("id") 
	private String idFilme;
	

	public double getVotos() {
		return votos;
	}
	public void setVotos(double votos) {
		this.votos = votos;
	}
	public String getIdFilme() {
		return idFilme;
	}
	public void setIdFilme(String idFilme) {
		this.idFilme = idFilme;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	public String getDataLancamento() {
		return dataLancamento;
	}
	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
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
	
	
}
