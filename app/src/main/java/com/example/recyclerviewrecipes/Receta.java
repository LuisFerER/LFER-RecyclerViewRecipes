package com.example.recyclerviewrecipes;

import java.io.Serializable;

public class Receta implements Serializable {

    private String nombre;
    private String descripcion;
    private String intrucciones;

    Receta(String nombre, String descripcion, String instrucciones){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.intrucciones = instrucciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getIntrucciones() {
        return intrucciones;
    }
}
