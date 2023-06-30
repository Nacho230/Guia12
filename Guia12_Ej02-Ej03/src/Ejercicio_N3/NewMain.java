/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_N3;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

/**
 *
 * @author nacho
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Electrodomestico e1 = new Electrodomestico();
        Lavadora l1 = new Lavadora();
        Televisor t1 = new Televisor();
        ArrayList<Electrodomestico> listaAux = new ArrayList();
        Double aux = 0d;
        Double aux01 = 0d;
         listaAux.add(new Lavadora(40d, 1000d, 100d, "Rojo", 'A'));
        listaAux.add(new Lavadora(10d, 1000d, 60d, "Verde", 'C'));
        listaAux.add(new Televisor(50, true, 1000d, 50d, "Blanco", 'F'));
        listaAux.add(new Televisor(30, false, 1000d, 20d, "Azul", 'C'));

         
         for (Electrodomestico electrodomestico : listaAux) {
             
             if (electrodomestico instanceof Lavadora  ) {
                aux += electrodomestico.precioFinal();
              }
             if (electrodomestico instanceof Televisor) {
                 aux01 += electrodomestico.precioFinal();
             }
        }
         //System.out.println("El precio de todas las lavadoras es: " + aux);
         //System.out.println("El precio de todas las lavadoras es: " + aux01);
         System.out.println("El precio de todos los electrodomesticos juntos es: $" + (aux + aux01));
        
        
    }
    
}
