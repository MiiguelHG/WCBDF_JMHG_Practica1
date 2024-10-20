package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductoRepository {
    private List<Producto> productos = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    //Guardar Producto
    public Producto save(Producto producto){
        producto.setId(id.incrementAndGet());
        productos.add(producto);
        return producto;
    }

    // Obtener Productos
    public List<Producto> getProductos() {
        return productos;
    }

    // Obtener Producto por Id
    public Producto getProductoById(Long id){
        return productos.stream().filter(producto -> producto.getId().equals(id)).findFirst().orElse(null);
    }

    // Eliminar Producto
    public void delete (Long id){
        productos.removeIf(producto -> producto.getId().equals(id));
    }

    // Actualizar Producto
    public Producto update(Producto producto){
        delete(producto.getId());
        productos.add(producto);
        return producto;
    }
}
