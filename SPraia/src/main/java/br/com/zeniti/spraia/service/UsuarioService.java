package br.com.zeniti.spraia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.zeniti.spraia.model.Usuario;
import br.com.zeniti.spraia.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public Page<Usuario> listAll(Pageable paginacao){
        return usuarioRepository.findAll(paginacao);
    }

    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Optional<Usuario> get(Long id){
        return usuarioRepository.findById(id);
    }

    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }
}
