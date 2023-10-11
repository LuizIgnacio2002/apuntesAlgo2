package com.mycompany.ejercicio5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UsuarioInvitado
 */
public class Triangulo_Isoceles {
    private double base;
    private double lado;

    public Triangulo_Isoceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double obtenerPerimetro(){
        double perimetro = 2 * lado + base;
        return perimetro;
    }
    
    public double obtenerArea(){
        double area = (base *(lado*lado - (base*base)/4))/2;
        return area;
    }
    
    public String mostrarDatos(){
        return "Base: " +  base + "\nLado: " + lado + "\nPerimetro: " + obtenerPerimetro() + "\n area: " + obtenerArea();
    }
}
