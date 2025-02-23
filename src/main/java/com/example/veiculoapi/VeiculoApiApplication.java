package com.example.veiculoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import com.example.veiculoapi.model.Veiculo;
import com.example.veiculoapi.repository.VeiculoRepository;

@SpringBootApplication
public class VeiculoApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(VeiculoApiApplication.class, args);
    }
    
    @Bean
    CommandLineRunner initDatabase(VeiculoRepository repository) {
        return args -> {
            repository.save(new Veiculo("ABC-1234", "Fiat", "Uno", "2015", "12345678900"));
            repository.save(new Veiculo("XYZ-5678", "Chevrolet", "Onix", "2020", "09876543211"));
        };
    }
}
