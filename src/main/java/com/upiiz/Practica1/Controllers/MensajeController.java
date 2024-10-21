package com.upiiz.Practica1.Controllers;

import com.upiiz.Practica1.Models.Mensaje;
import com.upiiz.Practica1.Services.MensajeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/mensajes")
public class MensajeController {
    private MensajeService mensajeService;

    public MensajeController(MensajeService mensajeService){
        this.mensajeService = mensajeService;
    }

    //GET
    @GetMapping
    public ResponseEntity<List<Mensaje>> getMensajes(){
        return ResponseEntity.ok(mensajeService.getAllMensajes());
    }

    //GET by Id
    @GetMapping("/{id}")
    public ResponseEntity<Mensaje> getMensajeById(@PathVariable String id){
        return ResponseEntity.ok(mensajeService.getMensajeById(id));
    }

    //POST
    @PostMapping
    public ResponseEntity<Mensaje> saveMensaje(@RequestBody Mensaje mensaje){
        Mensaje newMensaje = mensajeService.save(mensaje);
        return ResponseEntity.created(URI.create("/api/v1/mensajes/" + newMensaje.getId())).body(newMensaje);
    }

    //PUT
    @PutMapping("/{id}")
    public  ResponseEntity<Mensaje> updateMensaje(@PathVariable String id, @RequestBody Mensaje mensaje){
        mensaje.setId(id);
        return ResponseEntity.ok(mensajeService.update(mensaje));
    }

    //DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMensaje(@PathVariable String id){
        mensajeService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
