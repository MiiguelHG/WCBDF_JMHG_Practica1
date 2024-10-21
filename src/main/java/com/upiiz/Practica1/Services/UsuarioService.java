package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.Usuario;
import com.upiiz.Practica1.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    //Requiero inyectar el repositorio
    private final UsuarioRepository usuarioRepository;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    //GET
    public List<Usuario> getAllUsuarios (){
        return usuarioRepository.findAll();
    }

    //GET by Id
    public Usuario getUsuarioById(String id){
        return usuarioRepository.findById(id).orElse(null);
    }

    //POST
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //PUT
    public Usuario update(Usuario usuario){
        if (usuarioRepository.findById(usuario.getId()).orElse(null) != null){
            return usuarioRepository.save(usuario);
        }
        return null;
    }
    //DELETE
    public void delete(String id){
        usuarioRepository.deleteById(id);
    }
}
