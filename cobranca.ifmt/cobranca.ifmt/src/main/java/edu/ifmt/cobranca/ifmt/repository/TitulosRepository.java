package edu.ifmt.cobranca.ifmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.ifmt.cobranca.ifmt.model.Titulo;

public interface TitulosRepository extends JpaRepository<Titulo, Long> {
}
