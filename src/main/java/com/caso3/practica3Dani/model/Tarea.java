package com.caso3.practica3Dani.model;

import java.util.concurrent.atomic.AtomicInteger;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Tarea {
    private static final AtomicInteger contador = new AtomicInteger(1);
    private int id;
    private String nombre;
    private boolean estado;
    private String fecha;

    public Tarea(String nombre, boolean estado, String fecha){
        this.id = contador.getAndIncrement();
        this.nombre = nombre;
        this.estado = estado;
        this.fecha = fecha;
    }
}
