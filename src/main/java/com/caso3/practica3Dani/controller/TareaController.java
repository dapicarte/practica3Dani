package com.caso3.practica3Dani.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caso3.practica3Dani.model.Tarea;
import com.caso3.practica3Dani.service.TareaService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("api/v1/tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @GetMapping
    public ResponseEntity<?> getTarea(){
        List<Tarea> lista = tareaService.readAll();
        if(lista.isEmpty()){
            return ResponseEntity
            .status(404)
            .body("No hay tareas ingresadas");
        }
    }
    
}
