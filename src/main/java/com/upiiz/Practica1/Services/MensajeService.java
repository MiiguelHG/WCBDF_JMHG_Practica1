package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.Mensaje;
import com.upiiz.Practica1.Repository.MensajeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeService {
    private MensajeRepository mensajeRepository;

    //Constructor
    public MensajeService(MensajeRepository mensajeRepository){
        this.mensajeRepository = mensajeRepository;
    }

    //GET
    public List<Mensaje> getAllMensajes(){
        return mensajeRepository.obtenerTodosLosMensajes();
    }

    //GET by Id
    public Mensaje getMensajeById(Long id){
        return mensajeRepository.obtenerMensajePorId(id);
    }

    //POST
    public Mensaje save(Mensaje mensaje){
        return mensajeRepository.guardar(mensaje);
    }

    //PUT
    public Mensaje update(Mensaje mensaje){
        return mensajeRepository.actualizar(mensaje);
    }

    //DELETE
    public void delete(Long id){
        mensajeRepository.eliminar(id);
    }
}
