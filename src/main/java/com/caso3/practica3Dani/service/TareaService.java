package com.caso3.practica3Dani.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caso3.practica3Dani.model.Tarea;
import com.caso3.practica3Dani.repository.TareaRepository;

@Service
public class TareaService {
    @Autowired
    private TareaRepository tareaRepository;

    public Tarea create(Tarea tarea){
        return tareaRepository.agregar(tarea);
    }

    public List<Tarea> readAll(){
        return tareaRepository.listarTareas();
    }

    public String delete(int id){
        if(tareaRepository.eliminar(id)){
            return "La tarea se ha eliminado";
        }
        return "La tarea no se ha eliminado";
    }
}
