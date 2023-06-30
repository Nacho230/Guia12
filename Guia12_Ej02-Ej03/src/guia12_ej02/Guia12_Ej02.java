/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_ej02;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;

/**
 *
 * @author nacho
 */
public class Guia12_Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Electrodomestico e1 = new Electrodomestico();
        Lavadora l1 = new Lavadora();
        Televisor t1 = new Televisor();
        
        
        l1.crearLavadora();
        System.out.println(l1);
        System.out.println("");
        t1.crearTelevisor();
        System.out.println(t1);
        System.out.println("");
        System.out.println(l1.precioFinal());
        System.out.println("");
        System.out.println(t1.precioFinal());
        
        
    }
    
}
