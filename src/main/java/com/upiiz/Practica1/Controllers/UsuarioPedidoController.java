package com.upiiz.Practica1.Controllers;

import com.upiiz.Practica1.Models.UsuarioPedido;
import com.upiiz.Practica1.Services.UsuarioPedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsuarioPedidoController {
    private UsuarioPedidoService usuarioPedidoService;

    public UsuarioPedidoController(UsuarioPedidoService usuarioPedidoService){
        this.usuarioPedidoService = usuarioPedidoService;
    }

    //GET
    @GetMapping("/usuariosPedidos")
    public ResponseEntity<List<UsuarioPedido>> getAllUsuariosPedidos(){
        return ResponseEntity.ok(usuarioPedidoService.getAllUsuariosPedidos());
    }

    //GET by Id
    @GetMapping("/usuariosPedidos/{id}")
    public ResponseEntity<UsuarioPedido> getUsuarioPedidoById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioPedidoService.getUsuarioPedidoById(id));
    }

    //GET all UsuarioPedido by UsuarioId
    @GetMapping("/usuarios/{usuario_id}/usuariosPedidos")
    public ResponseEntity<List<UsuarioPedido>> getUsuarioPedidoByUsuarioId(@PathVariable Long usuario_id){
        return ResponseEntity.ok(usuarioPedidoService.getUsuarioPedidoByUsuarioId(usuario_id));
    }

    //GET all UsuarioPedido by PedidoId
    @GetMapping("/pedidos/{pedido_id}/usuariosPedidos")
    public ResponseEntity<List<UsuarioPedido>> getUsuarioPedidoByPedidoId(@PathVariable Long pedido_id){
        return ResponseEntity.ok(usuarioPedidoService.getUsuarioPedidoByPedidoId(pedido_id));
    }

    //POST
    @PostMapping("/usuarios/{usuario_id}/pedidos/{pedido_id}/usuariosPedidos")
    public ResponseEntity<UsuarioPedido> saveUsuarioPedido(@PathVariable Long usuario_id, @PathVariable Long pedido_id){
        UsuarioPedido newUsuarioPedido = new UsuarioPedido();
        newUsuarioPedido.setUsuarioId(usuario_id);
        newUsuarioPedido.setPedidoId(pedido_id);
        return ResponseEntity.created(null).body(usuarioPedidoService.save(newUsuarioPedido));
    }

    //PUT by Id
    @PutMapping("/usuarios/{usuario_id}/pedidos/{pedido_id}/usuariosPedidos/{id}")
    public ResponseEntity<UsuarioPedido> updateUsuarioPedido(@PathVariable Long id, @PathVariable Long usuario_id, @PathVariable Long pedido_id){
        UsuarioPedido UpdateUsuarioPedido = new UsuarioPedido();
        UpdateUsuarioPedido.setId(id);
        UpdateUsuarioPedido.setUsuarioId(usuario_id);
        UpdateUsuarioPedido.setPedidoId(pedido_id);
        return ResponseEntity.ok(usuarioPedidoService.update(UpdateUsuarioPedido));
    }

    //DELETE by Id
    @DeleteMapping("/usuariosPedidos/{id}")
    public ResponseEntity<Void> deleteUsuarioPedido(@PathVariable Long id){
        usuarioPedidoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
