package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
}
