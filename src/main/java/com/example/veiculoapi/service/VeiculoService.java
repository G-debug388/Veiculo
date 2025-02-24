package com.example.veiculoapi.service;

import com.example.veiculoapi.model.Veiculo;
import com.example.veiculoapi.repository.VeiculoRepository;
import org.springframework.stereotype.Service;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {
    private final VeiculoRepository repository;

    public VeiculoService(VeiculoRepository repository) {
        this.repository = repository;
    }

    public List<Veiculo> findAll() {
        return repository.findAll();
    }

    public Optional<Veiculo> findById(Long id) {
        return repository.findById(id);
    }

    public Optional<Veiculo> findByPlaca(String placa) {
        return repository.findByPlaca(placa);
    }

    public Veiculo save(Veiculo veiculo) {
        // Verifica se a placa já existe antes de salvar
        if (repository.findByPlaca(veiculo.getPlaca()).isPresent()) {
            throw new DataIntegrityViolationException("Placa já cadastrada!");
        }
        return repository.save(veiculo);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}