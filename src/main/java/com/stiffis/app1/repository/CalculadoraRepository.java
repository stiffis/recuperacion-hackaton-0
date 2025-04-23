package com.stiffis.app1.repository;
import com.stiffis.app1.domain.Calculadora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculadoraRepository extends JpaRepository<Calculadora, Long> {
}
