package com.upiiz.Practica1.Controllers;

import com.upiiz.Practica1.Models.PedidoProducto;
import com.upiiz.Practica1.Services.PedidoProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PedidoProductoController {
    private PedidoProductoService pedidoProductoService;

    public PedidoProductoController(PedidoProductoService pedidoProductoService){
        this.pedidoProductoService = pedidoProductoService;
    }

    //GET
    @GetMapping("/pedidosProductos")
    public ResponseEntity<List<PedidoProducto>> getPedidosProductos(){
        return ResponseEntity.ok(pedidoProductoService.getAllPedidosProductos());
    }

    //GET by Id
    @GetMapping("/{id}")
    public ResponseEntity<PedidoProducto> getPedidoProductoById(@PathVariable Long id){
        return ResponseEntity.ok(pedidoProductoService.getPedidoProductoById(id));
    }

    //GET with PedidoId
    @GetMapping("/pedidos/{pedido_id}/pedidosProductos")
    public ResponseEntity<List<PedidoProducto>> getPedidosProductosByPedidoId(@PathVariable Long pedido_id){
        return ResponseEntity.ok(pedidoProductoService.getAllPedidosProductosByPedidoId(pedido_id));
    }

    //GET with ProductoId
    @GetMapping("/productos/{producto_id}/pedidosProductos")
    public ResponseEntity<List<PedidoProducto>> getPedidosProductosByProductoId(@PathVariable Long producto_id){
        return ResponseEntity.ok(pedidoProductoService.getAllPedidosProductosByProductoId(producto_id));
    }

    //POST
    @PostMapping("/pedidos/{pedido_id}/productos/{producto_id}/pedidosProductos")
    public ResponseEntity<PedidoProducto> savePedidoProducto(@RequestBody PedidoProducto pedidoProducto, @PathVariable Long pedido_id, @PathVariable Long producto_id) {
        PedidoProducto newPedidoProducto = pedidoProductoService.save(pedidoProducto);
        newPedidoProducto.setPedidoId(pedido_id);
        newPedidoProducto.setProductoId(producto_id);
        return ResponseEntity.created(null).body(newPedidoProducto);
    }

    //PUT
    @PutMapping("/pediodos/{pedido_id}/productos/{producto_id}/pedidosProductos/{id}")
    public ResponseEntity<PedidoProducto> updatePedidoProducto(@PathVariable Long id, @RequestBody PedidoProducto pedidoProducto, @PathVariable Long pedido_id, @PathVariable Long producto_id){
        pedidoProducto.setId(id);
        pedidoProducto.setPedidoId(pedido_id);
        pedidoProducto.setProductoId(producto_id);
        return ResponseEntity.ok(pedidoProductoService.update(pedidoProducto));
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedidoProducto(@PathVariable Long id){
        pedidoProductoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
