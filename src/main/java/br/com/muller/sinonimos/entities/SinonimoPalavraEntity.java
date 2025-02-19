package br.com.muller.sinonimos.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Builder
@Data 
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TB_SINONIMO_PALAVRA")
public class SinonimoPalavraEntity implements Serializable {

	private static final long serialVersionUID = -3252466674018503694L;
	
	@Id
	private Long id;

	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "sinonimo_id", nullable = false)
	@JsonIgnore
	private SinonimoEntity sinonimo;
    
}
