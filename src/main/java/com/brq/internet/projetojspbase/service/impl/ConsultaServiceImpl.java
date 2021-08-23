package com.brq.internet.projetojspbase.service.impl;

import javax.ws.rs.client.WebTarget;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brq.internet.projetojspbase.dto.FilmesDTO;
import com.brq.internet.projetojspbase.dto.SeriesDTO;
import com.brq.internet.projetojspbase.dto.SerieDetalheDTO;
import com.brq.internet.projetojspbase.dto.FilmeDetalheDTO;
import com.brq.internet.projetojspbase.service.ConsultaService;

@Service
public class ConsultaServiceImpl implements ConsultaService {

	@Autowired
	private WebTarget webTarget;

	@Override
	//Faz uma consulta e retorna uma FilmeDto com a lista de Filme.
	public FilmesDTO buscarFilmes() {
		Response response = webTarget.path("/trending/movie/week")
				.queryParam("api_key", "8f4d2c3310877087f1b9c8622a302c36")
				.queryParam("language", "pt-BR")
				.request()
				.get();

		return response.readEntity(FilmesDTO.class);

	}
	
	@Override
	//Faz uma consulta passando como Paramento o Id do filme e retorna uma Dto de detalhe dos Filmes.
	public FilmeDetalheDTO detalharFilme(String idFilme){
			
		Response response =  webTarget.path("/movie/")
				.path(idFilme) 
				.queryParam("api_key", "8f4d2c3310877087f1b9c8622a302c36")
				.queryParam("language", "pt-BR")
				.request()
				.get();
				return response.readEntity(FilmeDetalheDTO.class);
	}
	//Faz uma consulta e retorna uma SeriesDto lista de Filme.
	@Override
	public SeriesDTO buscarSerie() {
		Response response = webTarget.path("/trending/tv/week")
				.queryParam("api_key", "8f4d2c3310877087f1b9c8622a302c36")
				.queryParam("language", "pt-BR")
				.request()
				.get();

		return response.readEntity(SeriesDTO.class);

	}
	
	@Override
	
	//Faz uma consulta passando como Paramento o Id da Serie e retorna uma Dto de detalhe das Series.
	public SerieDetalheDTO detalhaSerie(String id){

			
		Response response =  webTarget.path("/tv/")
				.path(id) 
				.queryParam("api_key", "8f4d2c3310877087f1b9c8622a302c36")
				.queryParam("language", "pt-BR")
				.request()
				.get();
				return response.readEntity(SerieDetalheDTO.class);
	}
	

}
