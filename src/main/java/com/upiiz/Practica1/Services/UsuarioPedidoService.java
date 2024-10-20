package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.UsuarioPedido;
import com.upiiz.Practica1.Repository.UsuarioPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioPedidoService {
    private UsuarioPedidoRepository usuarioPedidoRepository;

    public UsuarioPedidoService(UsuarioPedidoRepository usuarioPedidoRepository){
        this.usuarioPedidoRepository = usuarioPedidoRepository;
    }

    //GET
    public List<UsuarioPedido> getAllUsuariosPedidos (){
        return usuarioPedidoRepository.getUsuariosPedidos();
    }

    //GET by Id
    public UsuarioPedido getUsuarioPedidoById(Long id){
        return usuarioPedidoRepository.getUsuarioPedidobyId(id);
    }

    //GET all UsuarioPedido by UsuarioId
    public List<UsuarioPedido> getUsuarioPedidoByUsuarioId(Long usuario_id){
        return usuarioPedidoRepository.getUsuarioPedidoByUsuarioId(usuario_id);
    }

    //GET all UsuarioPedido by PedidoId
    public List<UsuarioPedido> getUsuarioPedidoByPedidoId(Long pedido_id){
        return usuarioPedidoRepository.getUsuarioPedidoByPedidoId(pedido_id);
    }

    //POST
    public UsuarioPedido save(UsuarioPedido usuarioPedido){
        return usuarioPedidoRepository.save(usuarioPedido);
    }

    //PUT
    public UsuarioPedido update(UsuarioPedido usuarioPedido){
        return usuarioPedidoRepository.update(usuarioPedido);
    }

    //DELETE
    public void delete(Long id){
        usuarioPedidoRepository.delete(id);
    }
}
