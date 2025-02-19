package br.com.muller.sinonimos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.muller.sinonimos.entities.DificuldadeEntity;

public interface DificuldadeRepository extends JpaRepository<DificuldadeEntity, Long> {

}
