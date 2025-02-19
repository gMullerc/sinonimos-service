package br.com.muller.sinonimos.dtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class SinonimoDTO {
	private Long idDificuldade;
	private String descricao;
	private List<PalavraDTO> palavras;
}
