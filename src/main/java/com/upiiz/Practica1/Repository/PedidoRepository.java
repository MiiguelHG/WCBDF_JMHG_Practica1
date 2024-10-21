package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido, String> {
}
