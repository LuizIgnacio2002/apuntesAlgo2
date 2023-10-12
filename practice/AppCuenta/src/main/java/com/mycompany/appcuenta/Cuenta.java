/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appcuenta;

/**
 *
 * @author UsuarioInvitado
 */
import java.time.LocalDate; // Importar la clase LocalDate

/**
 *
 * @author UsuarioInvitado
 */
public abstract class Cuenta {
    private int numero;
    private String nombreCliente;
    private float saldo;
    private LocalDate fechaApertura; // Cambiar el tipo de fecha a LocalDate
    protected LocalDate FECHA_HOY = LocalDate.of(2023, 10, 11); // Fecha de ejemplo

    public Cuenta(int numero, String nombreCliente, float saldo) {
        this.numero = numero;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
        fechaApertura = FECHA_HOY;
    }

    /**
     * @return the numero
     */
    public int obtenerNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void colocarNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the nombreCliente
     */
    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void colocarNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the saldo
     */
    public float obtenerSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void colocarSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the fechaApertura
     */
    public LocalDate obtenerFechaApertura() {
        return fechaApertura;
    }

    /**
     * @param fechaApertura the fechaApertura to set
     */
    public void colocarFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    
    public abstract boolean depositar(float Monto);
    public abstract boolean retirar(float Monto);
    public abstract boolean calcularInteres(float nPorcentaje);
}
