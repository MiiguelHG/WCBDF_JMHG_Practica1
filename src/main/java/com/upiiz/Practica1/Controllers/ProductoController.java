package com.upiiz.Practica1.Controllers;

import com.upiiz.Practica1.Models.Producto;
import com.upiiz.Practica1.Services.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {
    private ProductoService productoService;

    public ProductoController(ProductoService productoService){
        this.productoService = productoService;
    }

    //GET
    @GetMapping
    public ResponseEntity<List<Producto>> getallProductos(){
        return ResponseEntity.ok(productoService.getAllProductos());
    }

    //GET by Id
    @GetMapping("/{id}")
    public ResponseEntity<Producto> getProductoById(Long id) {
        return ResponseEntity.ok(productoService.getProductoById(id));
    }

    //POST
    @PostMapping
    public ResponseEntity<Producto> saveProducto(@RequestBody Producto producto){
        Producto newProducto = productoService.save(producto);
        return ResponseEntity.created(null).body(newProducto);
    }

    //PUT
    @PutMapping("/{id}")
    public ResponseEntity<Producto> updateProducto(@PathVariable Long id, @RequestBody Producto producto){
        producto.setId(id);
        return ResponseEntity.ok(productoService.update(producto));
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Long id){
        productoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
