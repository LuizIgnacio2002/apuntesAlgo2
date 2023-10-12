/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appvehiculo;

/**
 *
 * @author UsuarioInvitado
 */
public class Automovil extends Vehiculo{
    private int numeroPuertas;
    
    public Automovil(String marca, int numeroPuertas){
        super(marca);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    public String mostrarDatos(){
        return super.mostrarDatos() + ", tipo: carro, numero de puertas: " + numeroPuertas;
    }
}
