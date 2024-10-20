package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.UsuarioMensaje;
import com.upiiz.Practica1.Repository.UsuarioMensajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioMensajeService {
    //Requiero inyectar el repositorio
    UsuarioMensajeRepository usuarioMensajeRepository;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public UsuarioMensajeService(UsuarioMensajeRepository usuarioMensajeRepository){
        this.usuarioMensajeRepository = usuarioMensajeRepository;
    }

    //GET
    public List<UsuarioMensaje> getAllUsuariosMensajes (){
        return usuarioMensajeRepository.getUsuarioMensajes();
    }

    //GET by Id
    public UsuarioMensaje getUsuarioMensajeById(Long id){
        return usuarioMensajeRepository.getUsuarioMensajeById(id);
    }

    //GET all mensajes by UsuarioId
    public List<UsuarioMensaje> getUsuarioMensajeByUsuarioId(Long usuarioId){
        return usuarioMensajeRepository.getUsuarioMensajeByUsuarioId(usuarioId);
    }

    //GET all mensajes by MensajeId
    public List<UsuarioMensaje> getUsuarioMensajeByMensajeId(Long mensajeId){
        return usuarioMensajeRepository.getUsuarioMensajeByMensajeId(mensajeId);
    }

    //POST
    public UsuarioMensaje save(UsuarioMensaje usuarioMensaje){
        return usuarioMensajeRepository.save(usuarioMensaje);
    }

    //PUT
    public UsuarioMensaje update(UsuarioMensaje usuarioMensaje){
        return usuarioMensajeRepository.update(usuarioMensaje);
    }
    //DELETE
    public void delete(Long id){
        usuarioMensajeRepository.delete(id);
    }
}
