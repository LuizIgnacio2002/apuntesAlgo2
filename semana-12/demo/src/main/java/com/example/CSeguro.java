package com.example;

public abstract class CSeguro {
    protected int poliza;
    protected String nombre;
    protected double prima;
    protected String planSeguro;
    protected double cobertura;

    public CSeguro(int nPoliza, String cNombre, double nPrima, String cPlan) {
        poliza = nPoliza;
        nombre = cNombre;
        prima = nPrima;
        planSeguro = cPlan;
        cobertura = 0;
    }

    public int obtenerPoliza() {
        return poliza;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public double obtenerPrima() {
        return prima;
    }

    public String obtenerPlanSeguro() {
        return planSeguro;
    }

    public double obtenerCobertura() {
        return cobertura;
    }

    public void colocarPoliza(int nPoliza) {
        poliza = nPoliza;
    }

    public void colocarNombre(String cNombre) {
        nombre = cNombre;
    }

    public void colocarPrima(double nPrima) {
        prima = nPrima;
    }

    public void colocarPlanSeguro(String cPlan) {
        planSeguro = cPlan;
    }

    public void colocarCobertura(double nCobertura) {
        cobertura = nCobertura;
    }

    public abstract void calcularCobertura();
}
