package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, String> {
}
