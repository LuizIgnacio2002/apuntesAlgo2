package com.mycompany.appvehiculo;

// Resto de la clase Vehiculo


class Vehiculo {
    private String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public String obtenerMarca() {
        return marca;
    }

    public String mostrarDatos() {
        return "Marca: " + marca;
    }
}