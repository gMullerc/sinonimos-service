package br.com.muller.sinonimos.controllers;
import java.util.List;

import jakarta.validation.Valid;

import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.muller.sinonimos.dtos.SinonimoDTO;
import br.com.muller.sinonimos.entities.SinonimoEntity;
import br.com.muller.sinonimos.services.SinonimoService;

@RestController
@RequestMapping(value = "/sinonimos")
@AllArgsConstructor
public class SinonimoController {
	
	private SinonimoService sinonimoService;
	
	@GetMapping 
	public ResponseEntity<List<SinonimoEntity>> buscarSinonimosRegistrados() {
		return ResponseEntity.ok(sinonimoService.listarItens());
	}

	
	@PostMapping 
	public ResponseEntity<Void> cadastrarSinonimo(@RequestBody @Valid SinonimoDTO sinonimo) {
		sinonimoService.cadastrarSinonimo(sinonimo);
		return ResponseEntity.status(HttpStatus.CREATED).body(null);
	}
}
