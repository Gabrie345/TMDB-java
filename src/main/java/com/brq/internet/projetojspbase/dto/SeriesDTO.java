package com.brq.internet.projetojspbase.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SeriesDTO {
	//Essa Dto da Acesso a Lista de Serie Dentro dela
	@JsonProperty("results") 
    public List<SerieDetalheDTO> resultadoDto;
	

	public List<SerieDetalheDTO> getResultadoDto() {
		return resultadoDto;
	}

	public void setResultadoDto(List<SerieDetalheDTO> resultadoDto) {
		this.resultadoDto = resultadoDto;
	}
}
