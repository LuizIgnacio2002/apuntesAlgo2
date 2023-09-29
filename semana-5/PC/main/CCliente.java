package main;

public class CCliente {
    private String apellidos;
    private int dni;
    private String direccion;
    private String nombre;
    private String fechaNac;
    
    CCliente() {
        this.apellidos = scanApellidos();
        this.nombre = scanNombre(); 
        this.dni = scanDni();
        this.direccion = scanDireccion();
        this.fechaNac = scanFechaNac();
    }

    public String getApellidos()    { return apellidos; }
    public String getNombre()       { return nombre; }
    public int getDni()             { return dni; }
    public String getDireccion()    { return direccion; }
    public String getFechaNac()     { return fechaNac; }

    private static String scanApellidos() {
        System.out.print("\nIngrese los apellidos del cliente\n> ");
        return App.sc.nextLine();
    }

    private static String scanNombre() {
        System.out.print("\nIngrese el nombre del cliente\n> ");
        return App.sc.nextLine();
    }

    private static int scanDni() {
        System.out.print("\nIngrese el DNI del cliente\n> ");
        return Integer.parseInt(App.sc.nextLine());
    }

    private static String scanDireccion() {
        System.out.print("\nIngrese la dirección del cliente\n> ");
        return App.sc.nextLine();
    }

    private static String scanFechaNac() {
        System.out.print("\nIngrese la fecha de nacimiento del cliente\n> ");
        return App.sc.nextLine();
    }

    public void mostrarDatos() {
        System.out.println("\n> Apellidos: " + getApellidos());        
        System.out.println("> Nombre: " + getNombre());
        System.out.println("> DNI: " + getDni());
        System.out.println("> Direccion: " + getDireccion());
        System.out.println("> Fecha de nacimiento: " + getFechaNac());
    }
}
