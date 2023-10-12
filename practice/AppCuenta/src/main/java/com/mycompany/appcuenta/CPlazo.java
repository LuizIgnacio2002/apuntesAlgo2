package com.mycompany.appcuenta;

import java.time.LocalDate;

public class CPlazo extends Cuenta {
    private int periodosMeses;
    private LocalDate fechaVencimiento;
    private float montoMinimo;

    public CPlazo(int numero, String nombreCliente, float saldo) {
        super(numero, nombreCliente, saldo);
        periodosMeses = 6; // Valor predeterminado
        fechaVencimiento = LocalDate.now().plusMonths(6); // Fecha de vencimiento por defecto en 6 meses desde la fecha actual
        montoMinimo = 0; // Valor predeterminado
    }

    public void colocarPeriodosMeses(int nPeriodo) {
        periodosMeses = nPeriodo;
    }

    public int obtenerPeriodos() {
        return periodosMeses;
    }

    public void colocarFechaVencimiento(LocalDate dFecVen) {
        fechaVencimiento = dFecVen;
    }

    public LocalDate obtenerFechaVencimiento() {
        return fechaVencimiento;
    }

    public void colocarMontoMinimo(float nMonMin) {
        montoMinimo = nMonMin;
    }

    public float obtenerMontoMinimo() {
        return montoMinimo;
    }

    @Override
    public boolean depositar(float nMonto) {
        LocalDate hoy = LocalDate.now();

        if (hoy.isEqual(fechaVencimiento) || hoy.isAfter(fechaVencimiento)) {
            colocarSaldo(obtenerSaldo() + nMonto);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean retirar(float nMonto) {
        LocalDate hoy = LocalDate.now();

        if (hoy.isEqual(fechaVencimiento) || hoy.isAfter(fechaVencimiento)) {
            if (nMonto <= obtenerSaldo()) {
                colocarSaldo(obtenerSaldo() - nMonto);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean calcularInteres(float nPorcentaje) {
        if (true) {
            float nInteres = obtenerSaldo() * nPorcentaje;
            colocarSaldo(obtenerSaldo() + nInteres);
            return true;
        }
    }
}


