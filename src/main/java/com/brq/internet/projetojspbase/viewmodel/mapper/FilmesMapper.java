package com.brq.internet.projetojspbase.viewmodel.mapper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.brq.internet.projetojspbase.dto.FilmesDTO;
import com.brq.internet.projetojspbase.dto.SeriesDTO;
import com.brq.internet.projetojspbase.dto.SerieDetalheDTO;
import com.brq.internet.projetojspbase.dto.FilmeDetalheDTO;
import com.brq.internet.projetojspbase.viewmodel.FilmeViewModel;
import com.brq.internet.projetojspbase.viewmodel.SerieViewModel;

public class FilmesMapper {
	// Mapper da Filme
	public static List<FilmeViewModel> from(FilmesDTO dto) {
		//Mapei a Dto e passa ela para o objeto a View model
		List<FilmeViewModel> lista = new ArrayList<FilmeViewModel>();
		for (FilmeDetalheDTO filmes : dto.getResultado()) {
			FilmeViewModel filmeViewModel = new FilmeViewModel();
			filmeViewModel.setTituloOriginal(filmes.getTituloOriginal());
			filmeViewModel.setTitulo(filmes.getTitulo());
			filmeViewModel.setDataLancamento(filmes.getDataLancamento());
			filmeViewModel.setPoster("https://image.tmdb.org/t/p/original/" + filmes.getPoster());
			filmeViewModel.setDescricao(filmes.getDescricao());
			filmeViewModel.setIdFilme(filmes.getIdFilme());
			filmeViewModel.setVotos(filmes.getVotos());
			lista.add(filmeViewModel);
		}

		return lista;
	}

	public static FilmeViewModel from(FilmeDetalheDTO filme) {
		FilmeViewModel filmeViewModel = new FilmeViewModel();

		filmeViewModel.setTituloOriginal(filme.getTituloOriginal());
		filmeViewModel.setTitulo(filme.getTitulo());

		// controle e conversão de datas
		DateTimeFormatter dataRecebidaDto = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate data = LocalDate.parse(filme.getDataLancamento(), dataRecebidaDto);
		DateTimeFormatter ModificadorDEFormadoData = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String format = ModificadorDEFormadoData.format(data);
		filmeViewModel.setDataLancamento(format);
		//////

		filmeViewModel.setPoster("https://image.tmdb.org/t/p/original/" + filme.getPoster());
		filmeViewModel.setDescricao(filme.getDescricao());
		filmeViewModel.setIdFilme(filme.getIdFilme());
		filmeViewModel.setVotos(filme.getVotos());

		return filmeViewModel;

	}

//Mapper da serie 
	public static List<SerieViewModel> from(SeriesDTO dto) {

		List<SerieViewModel> lista = new ArrayList<>();
		for (SerieDetalheDTO serie : dto.getResultadoDto()) {

			SerieViewModel serieViewModel = new SerieViewModel();

			serieViewModel.setTituloOriginal(serie.getTituloOriginal());
			serieViewModel.setTitulo(serie.getTitulo());
			serieViewModel.setDataLancamento(serie.getDataLancamento());
			serieViewModel.setPoster("https://image.tmdb.org/t/p/original/" + serie.getPoster());
			serieViewModel.setDescricao(serie.getDescricao());
			serieViewModel.setId(serie.getId());
			serieViewModel.setVotos(serie.getVotos());
			
			lista.add(serieViewModel);

		}
		return lista;
	}

	public static SerieViewModel from(SerieDetalheDTO serie) {
		SerieViewModel serieViewModel = new SerieViewModel();

		serieViewModel.setTituloOriginal(serie.getTituloOriginal());
		serieViewModel.setTitulo(serie.getTitulo());

		// controle e conversão de datas
		DateTimeFormatter dataRecebidaDto = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate data = LocalDate.parse(serie.getDataLancamento(), dataRecebidaDto);
		DateTimeFormatter ModificadorDEFormadoData = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		String format = ModificadorDEFormadoData.format(data);
		serieViewModel.setDataLancamento(format);
		//////

		serieViewModel.setPoster("https://image.tmdb.org/t/p/original/" + serie.getPoster());
		serieViewModel.setDescricao(serie.getDescricao());
		serieViewModel.setId(serie.getId());
		serieViewModel.setVotos(serie.getVotos());

		return serieViewModel;

	}
}
