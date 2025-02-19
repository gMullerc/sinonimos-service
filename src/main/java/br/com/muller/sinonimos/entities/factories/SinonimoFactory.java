package br.com.muller.sinonimos.entities.factories;

import br.com.muller.sinonimos.dtos.SinonimoDTO;
import br.com.muller.sinonimos.entities.DificuldadeEntity;
import br.com.muller.sinonimos.entities.SinonimoEntity;


public class SinonimoFactory {
	
	private SinonimoFactory() {}
	
	public static SinonimoEntity converterSinonimoDTO(SinonimoDTO sinonimoDTO, DificuldadeEntity dificuldade) {

		
		return SinonimoEntity
				.builder()
				.descricao(sinonimoDTO.getDescricao())
				.dificuldade(dificuldade)
				.build();
	}

}
