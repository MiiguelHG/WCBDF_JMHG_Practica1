package com.upiiz.Practica1.Controllers;

import com.upiiz.Practica1.Models.Pedido;
import com.upiiz.Practica1.Models.PedidoProducto;
import com.upiiz.Practica1.Services.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pedidos")
public class PedidoController {
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService){
        this.pedidoService = pedidoService;
    }

    //GET
    @GetMapping
    public ResponseEntity<List<Pedido>> getallPedidos(){
        return ResponseEntity.ok(pedidoService.getAllPedidos());
    }

    //GET by Id
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> getPedidoById(@PathVariable String id){
        return ResponseEntity.ok(pedidoService.getPedidoById(id));
    }

    //POST
    @PostMapping
    public ResponseEntity<Pedido> savePedido(@RequestBody Pedido pedido){
        Pedido newPedido = pedidoService.save(pedido);
        return ResponseEntity.created(null).body(newPedido);
    }

    //PUT
    @PutMapping("/{id}")
    public ResponseEntity<Pedido> updatePedido(@PathVariable String id, @RequestBody Pedido pedido){
        pedido.setId(id);
        return ResponseEntity.ok(pedidoService.update(pedido));
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePedido(@PathVariable String id){
        pedidoService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
