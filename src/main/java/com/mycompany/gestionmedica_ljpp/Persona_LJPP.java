/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionmedica_ljpp;

/**
 *
 * @author perez
 */
public class Persona_LJPP {
    private String nombre_LJPP;
    private int edad_LJPP;
    private String direccion_LJPP;

    public Persona_LJPP(String nombre_LJPP, int edad_LJPP, String direccion_LJPP) {
        this.nombre_LJPP = nombre_LJPP;
        this.edad_LJPP = edad_LJPP;
        this.direccion_LJPP = direccion_LJPP;
    }

    public String getNombre_LJPP() {
        return nombre_LJPP;
    }

    public void setNombre_LJPP(String nombre_LJPP) {
        this.nombre_LJPP = nombre_LJPP;
    }

    public int getEdad_LJPP() {
        return edad_LJPP;
    }

    public void setEdad_LJPP(int edad_LJPP) {
        this.edad_LJPP = edad_LJPP;
    }

    public String getDireccion_LJPP() {
        return direccion_LJPP;
    }

    public void setDireccion_LJPP(String direccion_LJPP) {
        this.direccion_LJPP = direccion_LJPP;
    }

    
}
