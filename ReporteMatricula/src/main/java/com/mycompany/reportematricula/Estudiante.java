/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reportematricula;

/**
 *
 * @author UsuarioInvitado
 */
public class Estudiante {
    private int codigo;
    private String nombre;
    private String facultad;
    private String escuela;
    private String especialidad;
    private String planEstudios;
    
    

    

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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
     * @return the facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * @param facultad the facultad to set
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    /**
     * @return the escuela
     */
    public String getEscuela() {
        return escuela;
    }

    /**
     * @param escuela the escuela to set
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the planEstudios
     */
    public String getPlanEstudios() {
        return planEstudios;
    }

    /**
     * @param planEstudios the planEstudios to set
     */
    public void setPlanEstudios(String planEstudios) {
        this.planEstudios = planEstudios;
    }

    
    public void mostrarDatos() {
        System.out.println("Código del estudiante: " + getCodigo());
        System.out.println("Nombre del estudiante: " + getNombre());
        System.out.println("Facultad: " + getFacultad());
        System.out.println("Escuela: " + getEscuela());
        System.out.println("Especialidad: " + getEspecialidad());
        System.out.println("Plan de Estudios: " + getPlanEstudios());
    }

}
