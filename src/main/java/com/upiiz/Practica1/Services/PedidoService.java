package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.Pedido;
import com.upiiz.Practica1.Repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    //Requiero inyectar el repositorio
    PedidoRepository pedidoRepository;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public PedidoService(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    //GET
    public List<Pedido> getAllPedidos (){
        return pedidoRepository.getPedidos();
    }

    //GET by Id
    public Pedido getPedidoById(Long id){
        return pedidoRepository.obtenerPedidoPorId(id);
    }

    //POST
    public Pedido save(Pedido pedido){
        return pedidoRepository.guardar(pedido);
    }

    //PUT
    public Pedido update(Pedido pedido){
        return pedidoRepository.actualizar(pedido);
    }

    //DELETE
    public void delete(Long id){
        pedidoRepository.eliminar(id);
    }
}
