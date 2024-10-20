package com.upiiz.Practica1.Controllers;

import com.upiiz.Practica1.Models.UsuarioMensaje;
import com.upiiz.Practica1.Services.UsuarioMensajeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsuarioMensajeController {
    private UsuarioMensajeService usuarioMensajeService;

    public UsuarioMensajeController(UsuarioMensajeService usuarioMensajeService){
        this.usuarioMensajeService = usuarioMensajeService;
    }

    //GET
    @GetMapping("/usuariosMensajes")
    public ResponseEntity<List<UsuarioMensaje>> getAllUsuariosMensajes(){
        return ResponseEntity.ok(usuarioMensajeService.getAllUsuariosMensajes());
    }

    //GET by Id
    @GetMapping("/usuariosMensajes/{id}")
    public ResponseEntity<UsuarioMensaje> getUsuarioMensajeById(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioMensajeService.getUsuarioMensajeById(id));
    }

    //GET all mensajes by UsuarioId
    @GetMapping("/usuarios/{usuario_id}/usuariosMensajes")
    public ResponseEntity<List<UsuarioMensaje>> getUsuarioMensajeByUsuarioId(@PathVariable Long usuario_id){
        return ResponseEntity.ok(usuarioMensajeService.getUsuarioMensajeByUsuarioId(usuario_id));
    }

    //GET all usuarios by MensajeId
    @GetMapping("/mensajes/{mensaje_id}/usuariosMensajes")
    public ResponseEntity<List<UsuarioMensaje>> getUsuarioMensajeByMensajeId(@PathVariable Long mensaje_id){
        return ResponseEntity.ok(usuarioMensajeService.getUsuarioMensajeByMensajeId(mensaje_id));
    }

    //POST
    @PostMapping("/usuarios/{usuario_id}/mensajes/{mensaje_id}/usuariosMensajes")
    public ResponseEntity<UsuarioMensaje> saveUsuarioMensaje(@PathVariable Long usuario_id, @PathVariable Long mensaje_id){
        UsuarioMensaje newUsuarioMensaje = new UsuarioMensaje();
        newUsuarioMensaje.setUsuarioId(usuario_id);
        newUsuarioMensaje.setMensajeId(mensaje_id);
        return ResponseEntity.created(null).body(usuarioMensajeService.save(newUsuarioMensaje));
    }

    //PUT by Id
    @PutMapping("/usuarios/{usuario_id}/mensajes/{mensaje_id}/usuariosMensajes/{id}")
    public ResponseEntity<UsuarioMensaje> updateUsuarioMensaje(@PathVariable Long id, @PathVariable Long usuario_id, @PathVariable Long mensaje_id){
        UsuarioMensaje UpdateUsuarioMensaje = new UsuarioMensaje();
        UpdateUsuarioMensaje.setId(id);
        UpdateUsuarioMensaje.setUsuarioId(usuario_id);
        UpdateUsuarioMensaje.setMensajeId(mensaje_id);
        return ResponseEntity.ok(usuarioMensajeService.update(UpdateUsuarioMensaje));
    }

    //DELETE by Id
    @DeleteMapping("/usuariosMensajes/{id}")
    public ResponseEntity<Void> deleteUsuarioMensaje(@PathVariable Long id){
        usuarioMensajeService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
