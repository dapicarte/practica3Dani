package com.caso3.practica3Dani.model;

import java.util.concurrent.atomic.AtomicInteger;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Tarea {
    private static final AtomicInteger contador = new AtomicInteger(1);
    private int id;
    @NotBlank(message = "El nombre de la tarea no puede ser vacio")
    @Size(min = 4, max = 20, message = "El nombre de la tarea debe ser entre 4 y 20 caracteres")
    private String nombre;
    
    private boolean estado;
    @NotBlank(message = "La fecha no puede ser vacia")
    @Size(min = 4, max = 20, message = "La fecha de la tarea debe ser entre 4 y 20 caracteres")
    private String fecha;

    public Tarea(String nombre, boolean estado, String fecha){
        this.id = contador.getAndIncrement();
        this.nombre = nombre;
        this.estado = estado;
        this.fecha = fecha;
    }
}
