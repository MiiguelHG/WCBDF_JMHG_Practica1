package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.PedidoProducto;
import com.upiiz.Practica1.Repository.PedidoProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoProductoService {
    private PedidoProductoRepository pedidoProductoRepostitory;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public PedidoProductoService(PedidoProductoRepository pedidoProductoRepostitory){
        this.pedidoProductoRepostitory = pedidoProductoRepostitory;
    }

    //GET
    public List<PedidoProducto> getAllPedidosProductos (){
        return pedidoProductoRepostitory.getPedidosProductos();
    }

    //GET by PedidoId
    public List<PedidoProducto> getAllPedidosProductosByPedidoId(Long pedido_id){
        return pedidoProductoRepostitory.getAllPedidosProductosByPedidoId(pedido_id);
    }

    //GET by ProductoId
    public List<PedidoProducto> getAllPedidosProductosByProductoId(Long producto_id){
        return pedidoProductoRepostitory.getAllPedidosProductosByProductoId(producto_id);
    }

    //GET by Id
    public PedidoProducto getPedidoProductoById(Long id){
        return pedidoProductoRepostitory.obtenerPedidoProductoPorId(id);
    }

    //POST
    public PedidoProducto save(PedidoProducto pedidoProducto){
        return pedidoProductoRepostitory.guardar(pedidoProducto);
    }

    //PUT
    public PedidoProducto update(PedidoProducto pedidoProducto){
        return pedidoProductoRepostitory.actualizar(pedidoProducto);
    }
    //DELETE
    public void delete(Long id){
        pedidoProductoRepostitory.eliminar(id);
    }
}
