package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.UsuarioMensaje;
import com.upiiz.Practica1.Repository.UsuarioMensajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioMensajeService {
    //Requiero inyectar el repositorio
    private final UsuarioMensajeRepository usuarioMensajeRepository;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public UsuarioMensajeService(UsuarioMensajeRepository usuarioMensajeRepository){
        this.usuarioMensajeRepository = usuarioMensajeRepository;
    }

    //GET
    public List<UsuarioMensaje> getAllUsuariosMensajes (){
        return usuarioMensajeRepository.findAll();
    }

    //GET by Id
    public UsuarioMensaje getUsuarioMensajeById(String id){
        return usuarioMensajeRepository.findById(id).orElse(null);
    }

    //GET all mensajes by UsuarioId
    public List<UsuarioMensaje> getUsuarioMensajeByUsuarioId(String usuarioId){
        return usuarioMensajeRepository.findAllByUsuarioId(usuarioId);
    }

    //GET all mensajes by MensajeId
    public List<UsuarioMensaje> getUsuarioMensajeByMensajeId(String mensajeId){
        return usuarioMensajeRepository.findAllByMensajeId(mensajeId);
    }

    //POST
    public UsuarioMensaje save(UsuarioMensaje usuarioMensaje){
        return usuarioMensajeRepository.save(usuarioMensaje);
    }

    //PUT
    public UsuarioMensaje update(UsuarioMensaje usuarioMensaje){
        if (usuarioMensajeRepository.findById(usuarioMensaje.getId()).orElse(null) != null){
            return usuarioMensajeRepository.save(usuarioMensaje);
        }
        return null;
    }
    //DELETE
    public void delete(String id){
        usuarioMensajeRepository.deleteById(id);
    }
}
