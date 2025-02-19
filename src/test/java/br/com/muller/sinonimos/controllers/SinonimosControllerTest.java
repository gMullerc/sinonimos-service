package br.com.muller.sinonimos.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.muller.sinonimos.entities.SinonimoEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(Lifecycle.PER_METHOD)
@DisplayName("Testes referentes aos sinônimos controller")
class SinonimosControllerTest {
	
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    @DisplayName("Deve retornar corretamente os sinônimos encontrados no banco")
    void buscarSinonimosTotais() {
        ResponseEntity<List<SinonimoEntity>> response = restTemplate.exchange(
            "/sinonimos",
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<SinonimoEntity>>() {}
        );

        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
    }
}
