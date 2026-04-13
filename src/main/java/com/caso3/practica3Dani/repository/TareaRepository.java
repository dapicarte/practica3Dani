package com.caso3.practica3Dani.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.caso3.practica3Dani.model.Tarea;

@Repository
public class TareaRepository {
    private List<Tarea> listaTareas = new ArrayList<>();

    public Tarea agregar(Tarea tarea){
        listaTareas.add(tarea);
        return tarea;
    }

    public List<Tarea> listarTareas(){
        return listaTareas;
    }

    public boolean eliminar(int id){
        return listaTareas.removeIf(b -> b.getId()==id);
    }
}
