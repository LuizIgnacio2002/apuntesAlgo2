package enlazada.simples.alumnos;

public class EnlazadaSimplesAlumnos {

    public static void main(String[] args) {
        // Crear una lista enlazada
        CLista lista = new CLista();

        // Agregar nodos a la lista
        lista.agregarInicio(1, "Alumno1");
        lista.agregarInicio(2, "Alumno2");
        lista.agregarFinal(3, "Alumno3");

        // Buscar un nodo por código y mostrar el nombre asociado
        int codigoBuscado = 2;
        String nombreEncontrado = lista.buscarNombrePorCodigo(codigoBuscado);
        if (nombreEncontrado != null) {
            System.out.println("Nombre del alumno con código " + codigoBuscado + ": " + nombreEncontrado);
        } else {
            System.out.println("Alumno con código " + codigoBuscado + " no encontrado.");
        }

        // Buscar un nodo por nombre y mostrar el código asociado
        String nombreBuscado = "Alumno3";
        int codigoEncontrado = lista.buscarCodigoPorNombre(nombreBuscado);
        if (codigoEncontrado != -1) {
            System.out.println("Código del alumno con nombre " + nombreBuscado + ": " + codigoEncontrado);
        } else {
            System.out.println("Alumno con nombre " + nombreBuscado + " no encontrado.");
        }

        // Modificar el nombre de un alumno por código
        int codigoModificar = 1;
        String nuevoNombre = "NuevoNombre";
        boolean exito = lista.modificarNombrePorCodigo(codigoModificar, nuevoNombre);
        if (exito) {
            System.out.println("Nombre modificado con éxito.");
        } else {
            System.out.println("No se encontró un alumno con código " + codigoModificar);
        }


        // Insertar un nuevo nodo en la posición 2
        boolean insercionExitosa = lista.insertaNodo(4, "NuevoAlumno", 2);
        if (insercionExitosa) {
            System.out.println("Nuevo alumno insertado con éxito en la posición 2.");
        } else {
            System.out.println("No se pudo insertar el nuevo alumno.");
        }

        // Eliminar el nodo en la posición 3
        boolean eliminacionExitosa = lista.eliminarNodo(3);
        if (eliminacionExitosa) {
            System.out.println("Nodo en la posición 3 eliminado con éxito.");
        } else {
            System.out.println("No se pudo eliminar el nodo en la posición 3.");
        }

        // Liberar la lista
        lista.liberarLista();
        System.out.println("Lista liberada.");
    }
}
