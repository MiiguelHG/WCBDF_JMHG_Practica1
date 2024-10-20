package com.upiiz.Practica1.Repository;

import com.upiiz.Practica1.Models.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class UsuarioRepository {
    private List<Usuario> usuarios = new ArrayList<>();
    private AtomicLong id = new AtomicLong();

    //Guardar Usuario
    public Usuario save(Usuario usuario){
        usuario.setId(id.incrementAndGet());
        usuarios.add(usuario);
        return usuario;
    }

    // Obtener Usuarios
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    // Obtener Usuario por Id
    public Usuario getUsuarioById(Long id){
        return usuarios.stream().filter(usuario -> usuario.getId().equals(id)).findFirst().orElse(null);
    }

    // Eliminar Usuario
    public void delete (Long id){
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }

    // Actualizar Usuario
    public Usuario update(Usuario usuario){
        delete(usuario.getId());
        usuarios.add(usuario);
        return usuario;
    }
}
