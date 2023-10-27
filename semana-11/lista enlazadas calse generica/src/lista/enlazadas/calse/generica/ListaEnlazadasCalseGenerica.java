/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.enlazadas.calse.generica;

import java.util.ArrayList;
import java.util.List;

class Alumno {
    String nombre;
    int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}

class ListaAlumnos {
    List<Alumno> alumnos;

    public ListaAlumnos() {
        alumnos = new ArrayList<>();
    }

    public void agregarAlumno(String nombre, int edad) {
        Alumno nuevoAlumno = new Alumno(nombre, edad);
        alumnos.add(nuevoAlumno);
    }

    public void mostrarAlumnos() {
        System.out.println("Lista de alumnos:");
        for (Alumno alumno : alumnos) {
            alumno.mostrarInformacion();
        }
    }

    public Alumno buscarAlumno(String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno.nombre.equals(nombre)) {
                return alumno;
            }
        }
        return null;
    }

    public void eliminarAlumno(String nombre) {
        Alumno alumno = buscarAlumno(nombre);
        if (alumno != null) {
            alumnos.remove(alumno);
        }
    }

    public void modificarAlumno(String nombre, String nuevoNombre, int nuevaEdad) {
        Alumno alumno = buscarAlumno(nombre);
        if (alumno != null) {
            alumno.nombre = nuevoNombre;
            alumno.edad = nuevaEdad;
        }
    }

    public int contarAlumnos() {
        return alumnos.size();
    }

    public int calcularEdadPromedio() {
        int totalEdades = 0;
        for (Alumno alumno : alumnos) {
            totalEdades += alumno.edad;
        }
        if (alumnos.size() > 0) {
            return totalEdades / alumnos.size();
        } else {
            return 0;
        }
    }

    public void ordenarPorNombre() {
        alumnos.sort((a, b) -> a.nombre.compareTo(b.nombre));
    }

    public void ordenarPorEdad() {
        alumnos.sort((a, b) -> a.edad - b.edad);
    }

    public void vaciarLista() {
        alumnos.clear();
    }

    // Nuevas funciones
    public String buscarNombrePorEdad(int edad) {
        for (Alumno alumno : alumnos) {
            if (alumno.edad == edad) {
                return alumno.nombre;
            }
        }
        return "No se encontró un alumno con la edad: " + edad;
    }

    public int buscarEdadPorNombre(String nombre) {
        for (Alumno alumno : alumnos) {
            if (alumno.nombre.equals(nombre)) {
                return alumno.edad;
            }
        }
        return -1; // Valor de retorno que indica que el nombre no se encontró
    }
}

public class ListaEnlazadasCalseGenerica {

    public static void main(String[] args) {
        ListaAlumnos lista = new ListaAlumnos();

        lista.agregarAlumno("Juan", 20);
        lista.agregarAlumno("María", 22);
        lista.agregarAlumno("Pedro", 21);

        lista.mostrarAlumnos();

        String nombreBuscado = "María";
        Alumno alumnoBuscado = lista.buscarAlumno(nombreBuscado);

        if (alumnoBuscado != null) {
            System.out.println("Se encontró al alumno " + nombreBuscado + ":");
            alumnoBuscado.mostrarInformacion();
        } else {
            System.out.println("No se encontró al alumno " + nombreBuscado);
        }

        String nombreEliminar = "Pedro";
        lista.eliminarAlumno(nombreEliminar);
        System.out.println("Alumno " + nombreEliminar + " eliminado:");

        lista.mostrarAlumnos();
        
        System.out.println("Número de alumnos en la lista: " + lista.contarAlumnos());
        System.out.println("Edad promedio de los alumnos: " + lista.calcularEdadPromedio());

        System.out.println("Ordenados por nombre:");
        lista.ordenarPorNombre();
        lista.mostrarAlumnos();

        System.out.println("Ordenados por edad:");
        lista.ordenarPorEdad();
        lista.mostrarAlumnos();


        // Prueba de las nuevas funciones
        int edadBuscada = 22;
        String nombreEncontrado = lista.buscarNombrePorEdad(edadBuscada);
        System.out.println("Nombre asociado a la edad " + edadBuscada + ": " + nombreEncontrado);

        String nombreParaBuscarEdad = "Juan";
        int edadEncontrada = lista.buscarEdadPorNombre(nombreParaBuscarEdad);
        if (edadEncontrada != -1) {
            System.out.println("Edad asociada al nombre " + nombreParaBuscarEdad + ": " + edadEncontrada);
        } else {
            System.out.println("Nombre no encontrado.");
        }
        
        
        lista.vaciarLista();
        System.out.println("Lista de alumnos vacía:");
        lista.mostrarAlumnos();
    }
}
