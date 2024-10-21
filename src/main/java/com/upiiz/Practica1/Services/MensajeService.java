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
        return mensajeRepository.findAll();
    }

    //GET by Id
    public Mensaje getMensajeById(String id){
        return mensajeRepository.findById(id).orElse(null);
    }

    //POST
    public Mensaje save(Mensaje mensaje){
        return mensajeRepository.save(mensaje);
    }

    //PUT
    public Mensaje update(Mensaje mensaje){
        if(mensajeRepository.findById(mensaje.getId()).orElse(null) != null){
            return mensajeRepository.save(mensaje);
        }
        return null;
    }

    //DELETE
    public void delete(String id){
        mensajeRepository.deleteById(id);
    }
}
