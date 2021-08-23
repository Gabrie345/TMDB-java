package com.brq.internet.projetojspbase.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmesDTO {
	//Essa Dto da Acesso a Lista de Filmes Dentro dela
	@JsonProperty("page") 
    private int paginas;
	@JsonProperty("results") 
    private List<FilmeDetalheDTO> resultadoDto;
	@JsonProperty("total_pages") 
    private int totalPaginas;
	@JsonProperty("total_results") 
    private int totalResultados;
	
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public List<FilmeDetalheDTO> getResultado() {
		return resultadoDto;
	}
	public void setResultado(List<FilmeDetalheDTO> resultado) {
		this.resultadoDto = resultado;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	public int getTotalResultados() {
		return totalResultados;
	}
	public void setTotalResultados(int totalResultados) {
		this.totalResultados = totalResultados;
	}

}
