/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlazada.simples.alumnos;

/**
 *
 * @author AULAFISI
 */
public class CLista {
    private CNodo inicio;

    public CLista() {
        inicio = null;
    }
    
    public void colocarInicio(CNodo oInicio){
        inicio = oInicio;
    }
    
    public CNodo obtenerInicio() {
        return inicio;
    }

    public int longitud() {
        CNodo ptr = inicio;
        int num = 0;
        while (ptr != null) {
            num++;
            ptr = ptr.obtenerSiguiente();
        }
        return num;
    }

    public boolean existe(int nCodigo) {
        CNodo ptr = inicio;
        while (ptr != null && ptr.obtenerCodigo() != nCodigo) {
            ptr = ptr.obtenerSiguiente();
        }
        return ptr != null;
    }

    public void agregarInicio(int nCodigo, String sNombre) {
        if (!existe(nCodigo)) {
            CNodo nuevo = new CNodo(nCodigo, sNombre);
            nuevo.colocarSiguiente(inicio);
            inicio = nuevo;
        }
    }

    public void agregarFinal(int nCodigo, String sNombre) {
        if (!existe(nCodigo)) {
            CNodo nuevo = new CNodo(nCodigo, sNombre);
            if (inicio == null) {
                inicio = nuevo;
            } else {
                CNodo ptr = inicio;
                while (ptr.obtenerSiguiente() != null) {
                    ptr = ptr.obtenerSiguiente();
                }
                ptr.colocarSiguiente(nuevo);
            }
        }
    }

    public boolean insertaNodo(int nCodigo, String sNombre, int posicion) {
        int num = longitud();
        if (posicion <= num) {
            if (!existe(nCodigo)) {
                CNodo nuevo = new CNodo(nCodigo, sNombre);
                CNodo ptr = inicio;
                CNodo qtr = ptr;
                int k = 1;
                while (k < posicion) {
                    qtr = ptr;
                    ptr = ptr.obtenerSiguiente();
                    k++;
                }
                if (ptr == inicio) {
                    nuevo.colocarSiguiente(inicio);
                    inicio = nuevo;
                } else {
                    nuevo.colocarSiguiente(ptr);
                    qtr.colocarSiguiente(nuevo);
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean eliminarNodo(int posicion) {
        int num = longitud();
        if (posicion <= num) {
            CNodo ptr = inicio;
            CNodo qtr = ptr;
            int k = 1;
            while (k < posicion) {
                qtr = ptr;
                ptr = ptr.obtenerSiguiente();
                k++;
            }
            if (ptr == inicio) {
                inicio = inicio.obtenerSiguiente();
            } else {
                qtr.colocarSiguiente(ptr.obtenerSiguiente());
            }
            // Puedes liberar el nodo eliminado (ptr) si es necesario
            return true;
        } else {
            return false;
        }
    }

     public boolean liberarLista() {
        inicio = null; // Establece el inicio de la lista como nulo
        return true;
    }

    public String buscarNombrePorCodigo(int nCodigo) {
        CNodo ptr = inicio;
        while (ptr != null) {
            if (ptr.obtenerCodigo() == nCodigo) {
                return ptr.obtenerNombre();
            }
            ptr = ptr.obtenerSiguiente();
        }
        return null; // Si no se encuentra el código, retorna null
    }

    public int buscarCodigoPorNombre(String sNombre) {
        CNodo ptr = inicio;
        while (ptr != null) {
            if (ptr.obtenerNombre().equals(sNombre)) {
                return ptr.obtenerCodigo();
            }
            ptr = ptr.obtenerSiguiente();
        }
        return -1; // Si no se encuentra el nombre, retorna -1
    }

    public boolean modificarNombrePorCodigo(int nCodigo, String nuevoNombre) {
        CNodo ptr = inicio;
        while (ptr != null) {
            if (ptr.obtenerCodigo() == nCodigo) {
                ptr.colocarNombre(nuevoNombre);
                return true;
            }
            ptr = ptr.obtenerSiguiente();
        }
        return false; // Si no se encuentra el código, retorna false
    }
}
