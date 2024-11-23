/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionmedica_ljpp;

/**
 *
 * @author perez
 */
public class Paciente_LJPP extends Persona_LJPP {
    private int NhISTORIAL_LJPP;
    private String enfermedad_LJPP;

    public Paciente_LJPP(int NhISTORIAL_LJPP, String enfermedad_LJPP, String nombre_LJPP, int edad_LJPP, String direccion_LJPP) {
        super(nombre_LJPP, edad_LJPP, direccion_LJPP);
        this.NhISTORIAL_LJPP = NhISTORIAL_LJPP;
        this.enfermedad_LJPP = enfermedad_LJPP;
    }

    public int getNhISTORIAL_LJPP() {
        return NhISTORIAL_LJPP;
    }

    public void setNhISTORIAL_LJPP(int NhISTORIAL_LJPP) {
        this.NhISTORIAL_LJPP = NhISTORIAL_LJPP;
    }

    public String getEnfermedad_LJPP() {
        return enfermedad_LJPP;
    }

    public void setEnfermedad_LJPP(String enfermedad_LJPP) {
        this.enfermedad_LJPP = enfermedad_LJPP;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Historial:" + NhISTORIAL_LJPP);
        System.out.println("Enfermedad: " + enfermedad_LJPP);
    }
}
