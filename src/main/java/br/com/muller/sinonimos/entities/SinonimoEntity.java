package br.com.muller.sinonimos.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
@Table(name = "TB_SINONIMO")
public class SinonimoEntity  implements Serializable {

	private static final long serialVersionUID = -7249709177114811206L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @JoinColumn(name = "dificuldade_id", referencedColumnName = "id")
	@OneToOne(fetch = FetchType.EAGER)
	private DificuldadeEntity dificuldade;
    
	private String descricao;
	
	@OneToMany(mappedBy = "sinonimo", cascade = CascadeType.ALL, orphanRemoval = true)	
	private List<SinonimoPalavraEntity> sinonimosPalavra;

}
