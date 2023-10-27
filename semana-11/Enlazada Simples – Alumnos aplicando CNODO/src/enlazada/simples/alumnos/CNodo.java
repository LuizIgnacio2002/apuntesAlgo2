/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enlazada.simples.alumnos;

/**
 *
 * @author AULAFISI
 */
public class CNodo {
    private int codigo;
    private String nombre;
    private CNodo siguiente;

    public CNodo(int nCodigo, String sNombre) {
        codigo = nCodigo;
        nombre = sNombre;
        siguiente = null;
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public CNodo obtenerSiguiente() {
        return siguiente;
    }
    
    public void colocarCodigo(int nCodigo){
        codigo = nCodigo;
    }
    
    public void colocarNombre(String sNombre){
        nombre = sNombre;
    }

    public void colocarSiguiente(CNodo oSiguiente) {
        siguiente = oSiguiente;
    }
}
