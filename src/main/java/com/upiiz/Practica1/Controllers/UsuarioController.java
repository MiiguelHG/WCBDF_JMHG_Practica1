package com.upiiz.Practica1.Controllers;

import com.upiiz.Practica1.Models.Usuario;
import com.upiiz.Practica1.Services.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    //GET
    @GetMapping
    public ResponseEntity<List<Usuario>> getAllUsuarios(){
        return ResponseEntity.ok(usuarioService.getAllUsuarios());
    }

    //GET by Id
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable String id) {
        return ResponseEntity.ok(usuarioService.getUsuarioById(id));
    }

    //POST
    @PostMapping
    public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
        Usuario newUsuario = usuarioService.save(usuario);
        return ResponseEntity.created(null).body(newUsuario);
    }

    //PUT
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@PathVariable String id, @RequestBody Usuario usuario){
        usuario.setId(id);
        return ResponseEntity.ok(usuarioService.update(usuario));
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsuario(@PathVariable String id){
        usuarioService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
