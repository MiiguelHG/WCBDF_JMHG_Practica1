package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.Mensaje;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class MensajeRepository {
    private List<Mensaje> mensajes = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    //Guardar Mensaje
    public Mensaje guardar(Mensaje mensaje){
        mensaje.setId(id.incrementAndGet());
        mensajes.add(mensaje);
        return mensaje;
    }

    // Obtener Mensajes
    public List<Mensaje> obtenerTodosLosMensajes(){
        return mensajes;
    }

    // Obtener Mensaje por Id
    public Mensaje obtenerMensajePorId(Long id){
        return mensajes.stream().filter(mensaje -> mensaje.getId().equals(id)).findFirst().orElse(null);
    }

    // Eliminar Mensaje
    public void eliminar(Long id){
        mensajes.removeIf(mensaje -> mensaje.getId().equals(id));
    }

    // Actualizar Mensaje
    public Mensaje actualizar(Mensaje mensaje){
        eliminar(mensaje.getId());
        mensajes.add(mensaje);
        return mensaje;
    }
}
