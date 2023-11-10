package com.example;

public class CVivienda extends CSeguro {
    private String ubicacion;
    private double precio;
    private double porcentaje;

    public CVivienda(int nPoliza, String cNombre, double nPrima, String cPlan,
                     String cUbicacion, double nPrecio, double nPorcentaje) {
        super(nPoliza, cNombre, nPrima, cPlan);
        ubicacion = cUbicacion;
        precio = nPrecio;
        porcentaje = nPorcentaje;
        calcularCobertura();
    }

    public String obtenerUbicacion() {
        return ubicacion;
    }

    public void colocarUbicacion(String cUbicacion) {
        ubicacion = cUbicacion;
    }

    public double obtenerPrecio() {
        return precio;
    }

    public void colocarPrecio(double nPrecio) {
        precio = nPrecio;
    }

    public double obtenerPorcentaje() {
        return porcentaje;
    }

    public void colocarPorcentaje(double nPorcentaje) {
        porcentaje = nPorcentaje;
    }

    @Override
    public void calcularCobertura() {
        colocarCobertura(precio * porcentaje);
    }
}
