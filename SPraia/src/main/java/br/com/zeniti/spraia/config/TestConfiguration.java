package br.com.zeniti.spraia.config;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.config.Task;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.zeniti.spraia.model.Usuario;
import br.com.zeniti.spraia.repository.UsuarioRepository;


@Configuration
public class TestConfiguration implements CommandLineRunner {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
       
        usuarioRepository.saveAll(List.of(
            new Usuario("Gabriel", "gabriel@gmail.com",passwordEncoder.encode("123")),
            new Usuario("Amanda", "Amanda@gmail.com",passwordEncoder.encode("123")),
            new Usuario("Victor", "Victor@gmail.com",passwordEncoder.encode("123"))
        ));        

        usuarioRepository.save(
            new Usuario(
                "Gabriel", 
                "gabriel@gmail.com", 
                passwordEncoder.encode("123"))
        );
    }
    
}
