package org.example;

import java.util.ArrayList;
import java.util.List;

public class Listado {
    protected List<Tarea> tareas;

    public Listado() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String descripcion) {
        Tarea tarea = new Tarea(descripcion);
        this.tareas.add(tarea);
        tarea.setId(tareas.indexOf(tarea) + 1);
        System.out.println("Tarea agregada con éxito.");
    }

    public void verTareas() {
        if (this.tareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }
        System.out.println("Tareas:");
        for (int i = 0; i < this.tareas.size(); i++) {
            System.out.println("Tarea " + (i + 1) + ": " + this.tareas.get(i));
        }
    }

    public void marcarCompletada(int index) {
        if (index < 0 || index >= this.tareas.size()) {
            System.out.println("Índice inválido.");
            return;
        }
        Tarea tarea = this.tareas.get(index);
        tarea.status = true;
        System.out.println("Tarea " + (index + 1) + " marcada como completada.");
    }

    public void eliminarTarea(int index) {
        if (index < 0 || index >= this.tareas.size()) {
            System.out.println("Índice inválido.");
            return;
        }
        this.tareas.remove(index);
        System.out.println("Tarea " + (index + 1) + " eliminada.");
    }
}
