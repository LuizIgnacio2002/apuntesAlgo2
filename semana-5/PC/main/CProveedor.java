package main;

public class CProveedor {
    private String nombre;
    private int nif;
    private String direccion;

    CProveedor() {
        this.nombre = scanNombre();
        this.nif = scanNif();
        this.direccion = scanDireccion();
    }

    public String getNombre()       { return nombre; }
    public int getNif()             { return nif; }
    public String getDireccion()    { return direccion; }

    private static String scanNombre() {
        System.out.print("\nIngrese el nombre del proveedor\n> ");
        return App.sc.nextLine();
    }
    
    private static int scanNif() {
        System.out.print("\nIngrese el NIF del proveedor\n> ");
        return Integer.parseInt(App.sc.nextLine());
    }

    private static String scanDireccion() {
        System.out.print("\nIngrese la dirección del proveedor\n> ");
        return App.sc.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("\n> Nombre: " + getNombre());
        System.out.println("> NIF: " + getNif());
        System.out.println("> Direccion: " + getDireccion());
    }
}
