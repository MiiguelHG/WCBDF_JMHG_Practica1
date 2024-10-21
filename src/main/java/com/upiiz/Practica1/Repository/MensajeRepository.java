package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MensajeRepository extends MongoRepository<Mensaje, String> {
}
