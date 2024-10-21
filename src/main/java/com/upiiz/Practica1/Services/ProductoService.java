package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.Producto;
import com.upiiz.Practica1.Repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    //Requiero inyectar el repositorio
    private final ProductoRepository productoRepository;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    //GET
    public List<Producto> getAllProductos (){
        return productoRepository.findAll();
    }

    //GET by Id
    public Producto getProductoById(String id){
        return productoRepository.findById(id).orElse(null);
    }

    //POST
    public Producto save(Producto producto){
        return productoRepository.save(producto);
    }

    //PUT
    public Producto update(Producto producto){
        if (productoRepository.findById(producto.getId()).orElse(null) != null){
            return productoRepository.save(producto);
        }
        return null;
    }
    //DELETE
    public void delete(String id){
        productoRepository.deleteById(id);
    }
}
