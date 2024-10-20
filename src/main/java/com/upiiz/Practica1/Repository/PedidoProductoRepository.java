package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.PedidoProducto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class PedidoProductoRepository {
    private List<PedidoProducto> pedidosProductos = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    //Guardar PedidoProducto
    public PedidoProducto guardar(PedidoProducto pedidoProducto){
        pedidoProducto.setId(id.incrementAndGet());
        pedidosProductos.add(pedidoProducto);
        return pedidoProducto;
    }

    // Obtener PedidosProductos
    public List<PedidoProducto> getPedidosProductos() {
        return pedidosProductos;
    }

    // Obtener PedidosProductos con pediodo_id
    public List<PedidoProducto> getAllPedidosProductosByPedidoId(Long pedido_id) {
        return pedidosProductos.stream().filter(pedidoProducto -> pedidoProducto.getPedidoId().equals(pedido_id)).toList();
    }

    // Obtener PedidosProductos con producto_id
    public List<PedidoProducto> getAllPedidosProductosByProductoId(Long producto_id) {
        return  pedidosProductos.stream().filter(pedidoProducto -> pedidoProducto.getProductoId().equals(producto_id)).toList();
    }

    // Obtener PedidoProducto por Id
    public PedidoProducto obtenerPedidoProductoPorId(Long id){
        return pedidosProductos.stream().filter(pedidoProducto -> pedidoProducto.getId().equals(id)).findFirst().orElse(null);
    }

    // Eliminar PedidoProducto
    public void eliminar (Long id){
        pedidosProductos.removeIf(pedidoProducto -> pedidoProducto.getId().equals(id));
    }

    // Actualizar PedidoProducto
    public PedidoProducto actualizar(PedidoProducto pedidoProducto){
        eliminar(pedidoProducto.getId());
        pedidosProductos.add(pedidoProducto);
        return pedidoProducto;
    }
}
