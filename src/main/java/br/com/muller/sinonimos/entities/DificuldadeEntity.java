package br.com.muller.sinonimos.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data 
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_DIFICULDADE")
public class DificuldadeEntity implements Serializable  {

	private static final long serialVersionUID = -2370835926729296458L;

	@Id
	private Long id;
	
	private String descricao;
	
	private String codigo;
	
}
