package com.mycompany.appvehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class AppVehiculo {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al registro de vehículos");

        while (true) {
            System.out.println("¿Qué tipo de vehículo desea agregar (Automovil o Camion)? (Escriba 'salir' para finalizar)");
            String tipo = scanner.nextLine();

            if (tipo.equalsIgnoreCase("salir")) {
                break;
            }

            System.out.print("Ingrese la marca del vehículo: ");
            String marca = scanner.nextLine();

            if (tipo.equalsIgnoreCase("Automovil")) {
                System.out.print("Ingrese el número de puertas del automóvil: ");
                int puertas = Integer.parseInt(scanner.nextLine());
                vehiculos.add(new Automovil(marca, puertas));
            } else if (tipo.equalsIgnoreCase("Camion")) {
                System.out.print("Ingrese la capacidad de carga del camión (en kgs): ");
                int capacidadCarga = Integer.parseInt(scanner.nextLine());
                vehiculos.add(new Camion(marca, capacidadCarga));
            } else {
                System.out.println("Tipo de vehículo no válido. Intente nuevamente.");
            }
        }

        System.out.println("Lista de vehículos registrados:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.mostrarDatos());
        }
    }
}
