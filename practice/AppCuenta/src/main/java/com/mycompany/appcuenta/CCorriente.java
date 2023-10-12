package com.mycompany.appcuenta;

public class CCorriente extends Cuenta {
private float sobregiro;

public CCorriente(int numero, String nombreCliente, float saldo) {
    super(numero, nombreCliente, saldo);
    sobregiro = 2 * obtenerSaldo();
}

public CCorriente(int numero, String nombreCliente, float saldo, float nSobregiro) {
    super(numero, nombreCliente, saldo);
    sobregiro = nSobregiro;
}

public float obtenerSobregiro() {
    return sobregiro;
}

public void colocarSobregiro(float nSobregiro) {
    sobregiro = nSobregiro;
}

@Override
public boolean depositar(float nMonto) {
    colocarSaldo(obtenerSaldo() + nMonto);
    return true;
}

@Override
public boolean retirar(float nMonto) {
    if (nMonto <= obtenerSaldo() + sobregiro) {
        if (nMonto <= obtenerSaldo()) {
            colocarSaldo(obtenerSaldo() - nMonto);
        } else {
            sobregiro += obtenerSaldo() - nMonto;
            colocarSaldo(0);
        }
        return true;
    } else {
        return false;
    }
}

@Override
public boolean calcularInteres(float nPorcentaje) {
    float nInteres = obtenerSaldo() * nPorcentaje;
    colocarSaldo(obtenerSaldo() + nInteres);
    return true;
}

public boolean calcularMantenimiento(float nPorcentaje) {
    float nMantenimiento = obtenerSaldo() * nPorcentaje;
    colocarSaldo(obtenerSaldo() - nMantenimiento);
    return true;
}
}
