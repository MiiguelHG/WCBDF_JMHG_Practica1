package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.Pedido;
import com.upiiz.Practica1.Repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    //Requiero inyectar el repositorio
    private final PedidoRepository pedidoRepository;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public PedidoService(PedidoRepository pedidoRepository){
        this.pedidoRepository = pedidoRepository;
    }

    //GET
    public List<Pedido> getAllPedidos (){
        return pedidoRepository.findAll();
    }

    //GET by Id
    public Pedido getPedidoById(String id){
        return pedidoRepository.findById(id).orElse(null);
    }

    //POST
    public Pedido save(Pedido pedido){
        return pedidoRepository.save(pedido);
    }

    //PUT
    public Pedido update(Pedido pedido){
        if (pedidoRepository.findById(pedido.getId()).orElse(null) != null){
            return pedidoRepository.save(pedido);
        }
        return null;
    }

    //DELETE
    public void delete(String id){
        pedidoRepository.deleteById(id);
    }
}
