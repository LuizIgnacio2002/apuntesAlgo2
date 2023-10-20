/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admininfo;

/**
 *
 * @author AULAFISI
 */
public class AdminInfo {

    public static void main(String[] args) {
        // Crear una instancia de CTrabajador
        CTrabajdor trabajador = new CTrabajdor(1, "Juan", 2000);
        trabajador.calcularRetenciones(0.1f); // Calcular retenciones con una tasa del 10%
        trabajador.calcularNeto(1800); // Calcular el neto con un valor específico
        
        // Crear una instancia de CEmpleado
        CEmpleado empleado = new CEmpleado(2, "Ana", 2500, 5, 10);
        empleado.calcularDescuento();
        empleado.calcularNeto();
        
        // Crear una instancia de CConsultor
        CConsultor consultor = new CConsultor(3, "Carlos", 3000, 500);
        consultor.calcularNeto();
        
        // Mostrar los detalles de los trabajadores
        System.out.println("Trabajador:");
        System.out.println("Código: " + trabajador.obtenerCodigo());
        System.out.println("Nombre: " + trabajador.obtenerNombre());
        System.out.println("Básico: " + trabajador.obtenerBasico());
        System.out.println("Retenciones: " + trabajador.obtenerRetenciones());
        System.out.println("Neto: " + trabajador.obtenerNeto());
        
        System.out.println("\nEmpleado:");
        System.out.println("Código: " + empleado.obtenerCodigo());
        System.out.println("Nombre: " + empleado.obtenerNombre());
        System.out.println("Básico: " + empleado.obtenerBasico());
        System.out.println("Días de faltas: " + empleado.obtenerDiasFaltas());
        System.out.println("Horas extras: " + empleado.obtenerHorasExtras());
        System.out.println("Descuentos: " + empleado.obtenerDescuentos());
        System.out.println("Neto: " + empleado.obtenerNeto());
        
        System.out.println("\nConsultor:");
        System.out.println("Código: " + consultor.obtenerCodigo());
        System.out.println("Nombre: " + consultor.obtenerNombre());
        System.out.println("Básico: " + consultor.obtenerBasico());
        System.out.println("Bonificación: " + consultor.obtenerBonificacion());
        System.out.println("Neto: " + consultor.obtenerNeto());
    }
}
