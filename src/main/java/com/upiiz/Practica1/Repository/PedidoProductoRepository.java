package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.PedidoProducto;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PedidoProductoRepository extends MongoRepository<PedidoProducto, String> {
    List<PedidoProducto> findAllByProductoId(String producto_id);
    List<PedidoProducto> findAllByPedidoId(String pedido_id);
}
