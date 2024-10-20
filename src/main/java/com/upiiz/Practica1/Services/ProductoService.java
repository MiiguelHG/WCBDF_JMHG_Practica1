package com.upiiz.Practica1.Services;

import com.upiiz.Practica1.Models.Producto;
import com.upiiz.Practica1.Repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    //Requiero inyectar el repositorio
    ProductoRepository productoRepository;

    //Constructor - Cuando crear la instanica le pasa el repositorio
    public ProductoService(ProductoRepository productoRepository){
        this.productoRepository = productoRepository;
    }

    //GET
    public List<Producto> getAllProductos (){
        return productoRepository.getProductos();
    }

    //GET by Id
    public Producto getProductoById(Long id){
        return productoRepository.getProductoById(id);
    }

    //POST
    public Producto save(Producto producto){
        return productoRepository.save(producto);
    }

    //PUT
    public Producto update(Producto producto){
        return productoRepository.update(producto);
    }
    //DELETE
    public void delete(Long id){
        productoRepository.delete(id);
    }
}
