package main;

import java.util.List;

public class CTransaccion {
    private CCliente cliente;
    private CProducto producto;

    CTransaccion(List<CCliente> clientes, List<CProducto> productos) {
        this.cliente = scanCliente(clientes);
        this.producto = scanProducto(productos);
    }

    public CCliente getCliente()   { return cliente; }
    public CProducto getProducto()   { return producto; }

    private static CCliente scanCliente(List<CCliente> clientes) {
        System.out.print("Seleccione el cliente (Índice): ");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(i + ". " + clientes.get(i).getNombre());
        }
        int i = Integer.parseInt(App.sc.nextLine());
        CCliente cliente = clientes.get(i);
        return cliente;
    }

    private static CProducto scanProducto(List<CProducto> productos) {
        System.out.print("Seleccione el producto (Índice): ");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(i + ". " + productos.get(i).getNombre());
        }
        int i = Integer.parseInt(App.sc.nextLine());
        CProducto producto = productos.get(i);
        return producto;
    }

    public void mostrarDatos() {
        System.out.println("RECIBO DE VENTA\n\n");
        System.out.println("Datos del cliente:");
        cliente.mostrarDatos();
        System.out.println("Datos del producto:");
        producto.mostrarDatos();
    }
}
