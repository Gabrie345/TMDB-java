package com.brq.internet.projetojspbase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.brq.internet.projetojspbase.dto.FilmesDTO;
import com.brq.internet.projetojspbase.dto.SeriesDTO;
import com.brq.internet.projetojspbase.dto.SerieDetalheDTO;
import com.brq.internet.projetojspbase.dto.FilmeDetalheDTO;
import com.brq.internet.projetojspbase.service.ConsultaService;
import com.brq.internet.projetojspbase.viewmodel.FilmeViewModel;
import com.brq.internet.projetojspbase.viewmodel.SerieViewModel;
import com.brq.internet.projetojspbase.viewmodel.mapper.FilmesMapper;



@Controller
public class HomeController {
	
	@Autowired
	private ConsultaService service;
	private SerieDetalheDTO detalhaSerie;
	
	//controller para a home e adicionar a Lista de Filmes e Series 
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView model = new ModelAndView();
		
		FilmesDTO filmes = service.buscarFilmes();
		SeriesDTO serie = service.buscarSerie();
		
		List<FilmeViewModel> listaFilmes = FilmesMapper.from(filmes);
		List<SerieViewModel> listaSerie = FilmesMapper.from(serie);
		
		model.addObject("listaSerie", listaSerie);
		model.addObject("listaFilmes", listaFilmes);
		
		model.setViewName("home");
		return model;
		
	}
	//controller para a detalhar filme recebendo o Id dos Filmes  e retornando os dados do Filme selecionado
	@RequestMapping(value = "/detalharfilme/{filmesId}", method = RequestMethod.GET)
	public ModelAndView detalheFilme(@PathVariable String filmesId) {
		
		ModelAndView model = new ModelAndView();
		FilmeDetalheDTO filme= service.detalharFilme(filmesId);
		FilmeViewModel filmeViewModel = FilmesMapper.from(filme);
		
		model.addObject("filme", filmeViewModel);
		model.setViewName("detalharfilme");
		
		return model;
	}
	
	//controller para a detalhar Serie recebendo o Id das Series  e retornando os dados da Serie
	
	@RequestMapping(value = "/detalharserie/{serieId}", method = RequestMethod.GET)
	public ModelAndView detalheSerie(@PathVariable String serieId) {
		
		ModelAndView model = new ModelAndView();
		SerieDetalheDTO serie = service.detalhaSerie(serieId);
		SerieViewModel serieViewModel = FilmesMapper.from(serie);
		
		model.addObject("serie", serieViewModel);
		model.setViewName("detalharserie");
		
		return model;
	}
}			
