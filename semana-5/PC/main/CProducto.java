package main;

import java.util.List;

public class CProducto {
    private String nombre;
    private String codigo;
    private double precio;
    private CProveedor proveedor;

    CProducto(List<CProveedor> proveedores) {
        this.nombre = scanNombre();
        this.codigo = scanCodigo();
        this.precio = scanPrecio();
        this.proveedor = scanProveedeor(proveedores);
    }

    public String getNombre()   { return nombre; }
    public String getCodigo()   { return codigo; }
    public double getPrecio()   { return precio; }

    private static String scanCodigo() {
        System.out.print("\nIngrese el código del producto\n> ");
        return App.sc.nextLine();
    }

    private static String scanNombre() {
        System.out.print("\nIngrese el nombre del producto\n> ");
        return App.sc.nextLine();
    }

    private static double scanPrecio() {
        System.out.print("\nIngrese el precio del producto\n> ");
        return Double.parseDouble(App.sc.nextLine());
    }

    private static CProveedor scanProveedeor(List<CProveedor> proveedores) {
        System.out.print("Seleccione el proveedor (Índice): ");
        for (int i = 0; i < proveedores.size(); i++) {
            System.out.println(i + ". " + proveedores.get(i).getNombre());
        }
        int indiceProveedor = Integer.parseInt(App.sc.nextLine());
        CProveedor proveedor = proveedores.get(indiceProveedor);
        return proveedor;
    }

    public void mostrarDatos() {
        System.out.println("\n> Nombre: " + nombre);
        System.out.println("> Código: " + codigo);
        System.out.println("> Precio: " + precio);
        proveedor.mostrarDatos();
    }

}