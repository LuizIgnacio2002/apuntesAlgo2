/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admininfo;

/**
 *
 * @author AULAFISI
 */
public class CConsultor extends CTrabajdor{
    private int bonificacion;
    
    public CConsultor(int codigo, String nombre, int basico, int bonificacion){
        super(codigo, nombre, basico);
        this.bonificacion = bonificacion;
    }
    
    public int obtenerBonificacion(){
        return bonificacion;
    }
    
    public void colocarBonificacion(int bon){
        bonificacion = bon;
    }
    
    public void calcularNeto(){
        colocarNeto(super.obtenerBasico() - super.obtenerRetenciones() + bonificacion);
    }
}
