package br.com.muller.sinonimos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.muller.sinonimos.entities.SinonimoEntity;

public interface SinonimoRepository extends JpaRepository<SinonimoEntity, Long> {

}
