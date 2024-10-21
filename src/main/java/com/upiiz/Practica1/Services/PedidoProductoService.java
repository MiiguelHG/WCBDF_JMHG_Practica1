package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.PedidoProducto;
import com.upiiz.Practica1.Repository.PedidoProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoProductoService {
    private final PedidoProductoRepository pedidoProductoRepostitory;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public PedidoProductoService(PedidoProductoRepository pedidoProductoRepostitory){
        this.pedidoProductoRepostitory = pedidoProductoRepostitory;
    }

    //GET
    public List<PedidoProducto> getAllPedidosProductos (){
        return pedidoProductoRepostitory.findAll();
    }

    //GET by PedidoId
    public List<PedidoProducto> getAllPedidosProductosByPedidoId(String pedido_id){
        return pedidoProductoRepostitory.findAllByPedidoId(pedido_id);
    }

    //GET by ProductoId
    public List<PedidoProducto> getAllPedidosProductosByProductoId(String producto_id){
        return pedidoProductoRepostitory.findAllByProductoId(producto_id);
    }

    //GET by Id
    public PedidoProducto getPedidoProductoById(String id){
        return pedidoProductoRepostitory.findById(id).orElse(null);
    }

    //POST
    public PedidoProducto save(PedidoProducto pedidoProducto){
        return pedidoProductoRepostitory.save(pedidoProducto);
    }

    //PUT
    public PedidoProducto update(PedidoProducto pedidoProducto){
        if (pedidoProductoRepostitory.findById(pedidoProducto.getId()).orElse(null) != null){
            return pedidoProductoRepostitory.save(pedidoProducto);
        }
        return null;
    }
    //DELETE
    public void delete(String id){
        pedidoProductoRepostitory.deleteById(id);
    }
}
