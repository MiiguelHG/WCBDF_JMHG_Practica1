package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.UsuarioMensaje;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UsuarioMensajeRepository extends MongoRepository<UsuarioMensaje, String> {
    List<UsuarioMensaje> findAllByUsuarioId(String usuarioId);
    List<UsuarioMensaje> findAllByMensajeId(String mensajeId);
}
