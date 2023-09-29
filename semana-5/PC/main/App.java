package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static List<CProveedor> proveedores = new ArrayList<>();
    private static List<CCliente> clientes = new ArrayList<>();
    private static List<CProducto> productos = new ArrayList<>();
    private static List<CTransaccion> transacciones = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion; 
        do {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar Proveedor");
            System.out.println("2. Ver Proveedores");
            System.out.println("3. Agregar Cliente");
            System.out.println("4. Ver Clientes");
            System.out.println("5. Agregar Producto");
            System.out.println("6. Ver Productos");
            System.out.println("7. Realizar Transacción");
            System.out.println("8. Ver Transacciones");
            System.out.println("0. Salir");
            System.out.print("\nSeleccione una opción: ");
            
            opcion = Integer.parseInt(sc.nextLine());
            
            switch (opcion) {
                case 1: proveedores.add(new CProveedor()); break;
                case 2:
                    if (proveedores.isEmpty()) {
                        System.out.println("No hay proveedores registrados.");
                    } else {
                        System.out.println("\nLista de Proveedores:");
                        for (CProveedor p : proveedores) { p.mostrarDatos(); }
                    }
                    break;
                case 3: clientes.add(new CCliente()); break;
                case 4:
                    if (clientes.isEmpty()) {
                        System.out.println("No hay clientes registrados.");
                    } else {
                        System.out.println("\nLista de Clientes:");
                        for (CCliente c : clientes) { c.mostrarDatos(); }
                    }
                    break;
                case 5: productos.add(new CProducto(proveedores)); break;
                case 6:
                    if (productos.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.println("\nLista de productos:");
                        for (CProducto pr : productos) { pr.mostrarDatos(); }
                    }
                    break;
                case 7: transacciones.add(new CTransaccion(clientes, productos));
                case 8:
                    if (transacciones.isEmpty()) {
                        System.out.println("No hay transacciones registradas.");
                    } else {
                        System.out.println("\nLista de transacciones:");
                        for (CTransaccion t : transacciones) { t.mostrarDatos(); }
                    }
                    break;
                case 0: break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}