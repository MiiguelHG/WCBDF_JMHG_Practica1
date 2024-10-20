package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.UsuarioMensaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UsuarioMensajeRepository {
    private List<UsuarioMensaje> usuariosMensajes = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    //Guardar UsuarioMensaje
    public UsuarioMensaje save(UsuarioMensaje usuarioMensaje){
        usuarioMensaje.setId(id.incrementAndGet());
        usuariosMensajes.add(usuarioMensaje);
        return usuarioMensaje;
    }

    // Obtener UsuariosMensajes
    public List<UsuarioMensaje> getUsuarioMensajes() {
        return usuariosMensajes;
    }

    // Obtener UsuarioMensaje por Id
    public UsuarioMensaje getUsuarioMensajeById(Long id){
        return usuariosMensajes.stream().filter(usuarioMensaje -> usuarioMensaje.getId().equals(id)).findFirst().orElse(null);
    }

    // Obtener todos los UsuarioMensaje por UsuarioId
    public List<UsuarioMensaje> getUsuarioMensajeByUsuarioId(Long usuarioId){
        return usuariosMensajes.stream().filter(usuarioMensaje -> usuarioMensaje.getUsuarioId().equals(usuarioId)).toList();
    }

    // Obtener todos los UsuarioMensaje por MensajeId
    public List<UsuarioMensaje> getUsuarioMensajeByMensajeId(Long mensajeId){
        return usuariosMensajes.stream().filter(usuarioMensaje -> usuarioMensaje.getMensajeId().equals(mensajeId)).toList();
    }

    // Eliminar UsuarioMensaje
    public void delete (Long id){
        usuariosMensajes.removeIf(usuarioMensaje -> usuarioMensaje.getId().equals(id));
    }

    // Actualizar UsuarioMensaje
    public UsuarioMensaje update(UsuarioMensaje usuarioMensaje){
        delete(usuarioMensaje.getId());
        usuariosMensajes.add(usuarioMensaje);
        return usuarioMensaje;
    }
}
