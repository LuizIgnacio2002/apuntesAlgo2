package com.example;

public class CMedico extends CSeguro {
    private int edad;
    private String salud;

    public CMedico(int nPoliza, String cNombre, double nPrima, String cPlan, int nEdad, String cSalud) {
        super(nPoliza, cNombre, nPrima, cPlan);
        edad = nEdad;
        salud = cSalud;
        calcularCobertura();
    }

    public int obtenerEdad() {
        return edad;
    }

    public void colocarEdad(int nEdad) {
        edad = nEdad;
    }

    public String obtenerSalud() {
        return salud;
    }

    public void colocarSalud(String cSalud) {
        salud = cSalud;
    }

    @Override
    public void calcularCobertura() {
        if (edad > 80) {
            colocarCobertura(obtenerPrima() * 100);
        } else if (edad > 60) {
            colocarCobertura(obtenerPrima() * 200);
        } else if (edad > 40) {
            colocarCobertura(obtenerPrima() * 300);
        } else {
            colocarCobertura(obtenerPrima() * 400);
        }

        if (salud.equals("normal")) {
            colocarCobertura(obtenerCobertura() * 2);
        } else {
            colocarCobertura(obtenerCobertura() / 2);
        }
    }
}
