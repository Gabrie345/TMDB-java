package com.brq.internet.projetojspbase.service;

import org.springframework.stereotype.Service;

import com.brq.internet.projetojspbase.dto.FilmesDTO;
import com.brq.internet.projetojspbase.dto.SeriesDTO;
import com.brq.internet.projetojspbase.dto.SerieDetalheDTO;
import com.brq.internet.projetojspbase.dto.FilmeDetalheDTO;
@Service
public interface ConsultaService {
	//Essa Interface especificar o comportamento que a ConsultaService deve implementar.
	public FilmesDTO buscarFilmes();

	public FilmeDetalheDTO detalharFilme(String idFilme);

	public SeriesDTO buscarSerie();

	public SerieDetalheDTO detalhaSerie(String id);

}
