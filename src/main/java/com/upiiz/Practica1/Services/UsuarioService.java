package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.Usuario;
import com.upiiz.Practica1.Repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    //Requiero inyectar el repositorio
    private UsuarioRepository usuarioRepository;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    //GET
    public List<Usuario> getAllUsuarios (){
        return usuarioRepository.getUsuarios();
    }

    //GET by Id
    public Usuario getUsuarioById(Long id){
        return usuarioRepository.getUsuarioById(id);
    }

    //POST
    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    //PUT
    public Usuario update(Usuario usuario){
        return usuarioRepository.update(usuario);
    }
    //DELETE
    public void delete(Long id){
        usuarioRepository.delete(id);
    }
}
