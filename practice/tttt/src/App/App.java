package App;

import java.util.Scanner;


public class App {
    public static int indiceCocheMBarato(Vehiculo coches[])
    {
        float precio;
        int indice = 0;

        precio = coches[0].getPrecio();
        for(int i = 1; i < coches.length; i++)
        {
            if(coches[i].getPrecio() < precio)
            {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }

        return indice;
    }


    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numVehiculos, indiceBarato;

        System.out.print("Digite el número de vehículos: ");
        numVehiculos = entrada.nextInt();

        // Creamos los objetos para los coches
        Vehiculo coches[] = new Vehiculo[numVehiculos];

        for(int i = 0; i < coches.length; i++)
        {
            entrada.nextLine(); // Limpiar el buffer
            System.out.println("\nDigite las características del vehículo " + (i + 1) + ":");
            System.out.println("Marca: ");
            marca = entrada.nextLine();
            System.out.println("Modelo: ");
            modelo = entrada.nextLine();
            System.out.println("Precio: ");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        indiceBarato = indiceCocheMBarato(coches);

        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
}
