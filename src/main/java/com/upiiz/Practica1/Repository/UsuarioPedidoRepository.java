package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.UsuarioPedido;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UsuarioPedidoRepository extends MongoRepository<UsuarioPedido, String> {
    List<UsuarioPedido> findAllByUsuarioId(String usuario_id);
    List<UsuarioPedido> findAllByPedidoId(String pedido_id);
}
