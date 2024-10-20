package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.Pedido;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PedidoRepository {
    private List<Pedido> pedidos = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    //Guardar Pedido
    public Pedido guardar(Pedido pedido){
        pedido.setId(id.incrementAndGet());
        pedidos.add(pedido);
        return pedido;
    }

    // Obtener Pedidos
    public List<Pedido> getPedidos() {
        return pedidos;
    }

    // Obtener Pedido por Id
    public Pedido obtenerPedidoPorId(Long id){
        return pedidos.stream().filter(pedido -> pedido.getId().equals(id)).findFirst().orElse(null);
    }

    // Eliminar Pedido
    public void eliminar (Long id){
        pedidos.removeIf(pedido -> pedido.getId().equals(id));
    }

    // Actualizar Pedido
    public Pedido actualizar(Pedido pedido){
        eliminar(pedido.getId());
        pedidos.add(pedido);
        return pedido;
    }
}
