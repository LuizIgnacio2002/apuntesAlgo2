/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reportematricula;

/**
 *
 * @author UsuarioInvitado
 */
public class Curso {
    private String nombre;
    private int codigoEstudiante;
    private int creditosTotales;


    
    


    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigoEstudiante
     */
    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    /**
     * @param codigoEstudiante the codigoEstudiante to set
     */
    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    /**
     * @return the creditosTotales
     */
    public int getCreditosTotales() {
        return creditosTotales;
    }

    /**
     * @param creditosTotales the creditosTotales to set
     */
    public void setCreditosTotales(int creditosTotales) {
        this.creditosTotales = creditosTotales;
    }
    
    public void mostrarDatos() {;
        System.out.println("Nombre del curso: " + getNombre());
        System.out.println("Codigo Estudiante: " + getCodigoEstudiante());
        System.out.println("Creditos Totales: " + getCreditosTotales());
    }
}
