package br.com.zeniti.spraia.service;
import java.util.Optional;

import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.zeniti.spraia.model.Usuario;
import br.com.zeniti.spraia.repository.UsuarioRepository;

@Service
public class AuthenticationService implements UserDetailsService {

    @Autowired
    UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Usuario> optional = repository.findByEmail(email);

        System.out.println(optional.get());

        if(optional.isPresent()) return optional.get();
        

        throw new UsernameNotFoundException("username not found " + email);
    }
    
}
