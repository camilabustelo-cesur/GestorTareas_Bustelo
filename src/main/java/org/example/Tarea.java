package org.example;

public class Tarea {
    protected String descripcion;
    protected boolean status;
    public int id;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.status = false;

    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString() {
        String s = "Tarea: " + this.descripcion + "\n" + "Status: " + (this.status ? "Completada" : "Pendiente") + "\n" + "ID: " + this.id;
        return s;
    }
}


