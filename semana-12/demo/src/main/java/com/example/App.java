package com.example;

public final class App {
    private App() {
        // El constructor está vacío porque no es necesario inicializar nada aquí.
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // Crear instancias de seguros (puedes ajustar los valores según tus necesidades)
        CSeguro seguro1 = new CVivienda(1, "Cliente1", 500.0, "Plan1", "Lima", 100000.0, 0.1);
        CSeguro seguro2 = new CMedico(2, "Cliente2", 300.0, "Plan2", 45, "normal");

        // Imprimir detalles de los seguros por consola
        System.out.println("Detalles del Seguro 1:");
        imprimirDetallesSeguro(seguro1);

        System.out.println("\nDetalles del Seguro 2:");
        imprimirDetallesSeguro(seguro2);
    }

    private static void imprimirDetallesSeguro(CSeguro seguro) {
        System.out.println("Poliza: " + seguro.obtenerPoliza());
        System.out.println("Nombre: " + seguro.obtenerNombre());
        System.out.println("Prima: " + seguro.obtenerPrima());
        System.out.println("Plan Seguro: " + seguro.obtenerPlanSeguro());
        System.out.println("Cobertura: " + seguro.obtenerCobertura());
        System.out.println();
    }
}
