/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionmedica_ljpp;

/**
 *
 * @author perez
 */
public class Medico_LJPP extends Persona_LJPP {
    private String especialidad_LJPP;
    private int aniose_LJPP;

    public Medico_LJPP(String especialidad_LJPP, int aniose_LJPP, String nombre_LJPP, int edad_LJPP, String direccion_LJPP) {
        super(nombre_LJPP, edad_LJPP, direccion_LJPP);
        this.especialidad_LJPP = especialidad_LJPP;
        this.aniose_LJPP = aniose_LJPP;
    }

    public String getEspecialidad_LJPP() {
        return especialidad_LJPP;
    }

    public void setEspecialidad_LJPP(String especialidad_LJPP) {
        this.especialidad_LJPP = especialidad_LJPP;
    }

    public int getAniose_LJPP() {
        return aniose_LJPP;
    }

    public void setAniose_LJPP(int aniose_LJPP) {
        this.aniose_LJPP = aniose_LJPP;
    }
    
}
