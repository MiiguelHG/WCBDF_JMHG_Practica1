package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.UsuarioPedido;
import com.upiiz.Practica1.Repository.UsuarioPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioPedidoService {
    private final UsuarioPedidoRepository usuarioPedidoRepository;

    public UsuarioPedidoService(UsuarioPedidoRepository usuarioPedidoRepository){
        this.usuarioPedidoRepository = usuarioPedidoRepository;
    }

    //GET
    public List<UsuarioPedido> getAllUsuariosPedidos (){
        return usuarioPedidoRepository.findAll();
    }

    //GET by Id
    public UsuarioPedido getUsuarioPedidoById(String id){
        return usuarioPedidoRepository.findById(id).orElse(null);
    }

    //GET all UsuarioPedido by UsuarioId
    public List<UsuarioPedido> getUsuarioPedidoByUsuarioId(String usuario_id){
        return usuarioPedidoRepository.findAllByUsuarioId(usuario_id);
    }

    //GET all UsuarioPedido by PedidoId
    public List<UsuarioPedido> getUsuarioPedidoByPedidoId(String pedido_id){
        return usuarioPedidoRepository.findAllByPedidoId(pedido_id);
    }

    //POST
    public UsuarioPedido save(UsuarioPedido usuarioPedido){
        return usuarioPedidoRepository.save(usuarioPedido);
    }

    //PUT
    public UsuarioPedido update(UsuarioPedido usuarioPedido){
        if (usuarioPedidoRepository.findById(usuarioPedido.getId()).orElse(null) != null){
            return usuarioPedidoRepository.save(usuarioPedido);
        }
        return null;
    }

    //DELETE
    public void delete(String id){
        usuarioPedidoRepository.deleteById(id);
    }
}
