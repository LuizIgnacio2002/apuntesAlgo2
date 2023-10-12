package com.mycompany.appcuenta;

public class AppCuenta {

    public static void main(String[] args) {
        // Crear una cuenta corriente
        CCorriente cuentaCorriente = new CCorriente(1, "Cliente1", 1000);
        System.out.println("Cuenta Corriente:");
        System.out.println("Saldo inicial: " + cuentaCorriente.obtenerSaldo());
        cuentaCorriente.depositar(500);
        cuentaCorriente.retirar(300);
        System.out.println("Saldo final: " + cuentaCorriente.obtenerSaldo());
        cuentaCorriente.calcularInteres(0.05f);
        System.out.println("Saldo con interés: " + cuentaCorriente.obtenerSaldo());
        cuentaCorriente.calcularMantenimiento(0.02f);
        System.out.println("Saldo con mantenimiento: " + cuentaCorriente.obtenerSaldo());

        // Crear una cuenta a plazo
        CPlazo cuentaPlazo = new CPlazo(2, "Cliente2", 2000);
        System.out.println("\nCuenta a Plazo:");
        System.out.println("Saldo inicial: " + cuentaPlazo.obtenerSaldo());
        cuentaPlazo.depositar(1000);
        cuentaPlazo.retirar(500);
        System.out.println("Saldo final: " + cuentaPlazo.obtenerSaldo());
 

        // Mostrar información de las cuentas
        System.out.println("\nInformación de las cuentas:");
        System.out.println("Cuenta Corriente:");
        System.out.println("Número: " + cuentaCorriente.obtenerNumero());
        System.out.println("Nombre del cliente: " + cuentaCorriente.obtenerNombreCliente());
        System.out.println("Sobregiro: " + cuentaCorriente.obtenerSobregiro());
        //System.out.println("Fecha de apertura: " + cuentaCorriente.obtenerFechaApertura());

        System.out.println("\nCuenta a Plazo:");
        System.out.println("Número: " + cuentaPlazo.obtenerNumero());
        System.out.println("Nombre del cliente: " + cuentaPlazo.obtenerNombreCliente());
        System.out.println("Periodos en meses: " + cuentaPlazo.obtenerPeriodos());
        //System.out.println("Fecha de vencimiento: " + cuentaPlazo.obtenerFechaVencimiento());
        System.out.println("Monto mínimo: " + cuentaPlazo.obtenerMontoMinimo());
    }
}
