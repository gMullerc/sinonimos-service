package br.com.muller.sinonimos.services;

import java.util.List;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import br.com.muller.sinonimos.dtos.SinonimoDTO;
import br.com.muller.sinonimos.entities.DificuldadeEntity;
import br.com.muller.sinonimos.entities.SinonimoEntity;
import br.com.muller.sinonimos.entities.factories.SinonimoFactory;
import br.com.muller.sinonimos.repositories.DificuldadeRepository;
import br.com.muller.sinonimos.repositories.SinonimoRepository;

@Service
@AllArgsConstructor
public class SinonimoService {

	private SinonimoRepository sinonimoRepository;
	private DificuldadeRepository dificuldadeRepository;

	public List<SinonimoEntity> listarItens() {
		return sinonimoRepository.findAll();
	}

	public void cadastrarSinonimo(SinonimoDTO sinonimo) {

		DificuldadeEntity dificuldadeEntity = dificuldadeRepository
				.findById(sinonimo.getIdDificuldade())
				.orElseThrow(RuntimeException::new);
		SinonimoEntity converterSinonimoDTO = SinonimoFactory.converterSinonimoDTO(sinonimo, dificuldadeEntity);
		sinonimoRepository.save(converterSinonimoDTO);
	}

}
