package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.UsuarioPedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UsuarioPedidoRepository {
    private List<UsuarioPedido> usuariosPedidos = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    //Guardar UsuarioPedido
    public UsuarioPedido save(UsuarioPedido usuarioPedido){
        usuarioPedido.setId(id.incrementAndGet());
        usuariosPedidos.add(usuarioPedido);
        return usuarioPedido;
    }

    // Obtener UsuariosPedidos
    public List<UsuarioPedido> getUsuariosPedidos() {
        return usuariosPedidos;
    }

    // Obtener UsuarioPedido por Id
    public UsuarioPedido getUsuarioPedidobyId(Long id){
        return usuariosPedidos.stream().filter(usuarioPedido -> usuarioPedido.getId().equals(id)).findFirst().orElse(null);
    }

    // Obtener todos los UsuarioPedido por UsuarioId
    public List<UsuarioPedido> getUsuarioPedidoByUsuarioId(Long usuario_id){
        return usuariosPedidos.stream().filter(usuarioPedido -> usuarioPedido.getUsuarioId().equals(usuario_id)).toList();
    }

    // Obtener todos los UsuarioPedido por PedidoId
    public List<UsuarioPedido> getUsuarioPedidoByPedidoId(Long pedido_id){
        return usuariosPedidos.stream().filter(usuarioPedido -> usuarioPedido.getPedidoId().equals(pedido_id)).toList();
    }

    // Eliminar UsuarioPedido
    public void delete (Long id){
        usuariosPedidos.removeIf(usuarioPedido -> usuarioPedido.getId().equals(id));
    }

    // Actualizar UsuarioPedido
    public UsuarioPedido update(UsuarioPedido usuarioPedido){
        delete(usuarioPedido.getId());
        usuariosPedidos.add(usuarioPedido);
        return usuarioPedido;
    }
}
