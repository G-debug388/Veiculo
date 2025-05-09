package com.example.veiculoapi.repository;

import com.example.veiculoapi.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    Optional<Veiculo> findByPlaca(String placa); // Alterado de findByCpf para findByPlaca
}
