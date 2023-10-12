/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appvehiculo;

/**
 *
 * @author UsuarioInvitado
 */
public class Camion extends Vehiculo{
    private int capacidadCarga;
    
    public Camion(String marca, int capacidadCarga){
        super(marca);
        this.capacidadCarga = capacidadCarga;
    }
    
    public String mostrarDatos(){
        return super.mostrarDatos() + ", Tipo: Camion, Capacidad: " + capacidadCarga;
    }
}
