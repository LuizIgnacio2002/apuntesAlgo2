/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;
/**
 *
 * @author UsuarioInvitado
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int nTriangulos;
  
        System.out.println("Digite el numero de triangulos: ");
        nTriangulos = entrada.nextInt();
        
        Triangulo_Isoceles triangulos[] = new Triangulo_Isoceles[nTriangulos];
        
        for(int i = 0; i < triangulos.length; i++)
        {
            System.out.println("\n Digites los valores del triangulo :" + (i + 1));
            System.out.println("Introduzca la base: ");
            base = entrada.nextDouble();
            System.out.println("Introduzca el lado: ");
            lado = entrada.nextDouble();
            
            triangulos[i] = new Triangulo_Isoceles(base, lado);
            
           // System.out.println("\n El perimetro del triangulo es: " + triangulos[i].obtenerPerimetro();
            System.out.println("\n el area del triangulo es: " + triangulos[i].obtenerArea());
        }
    }
}
