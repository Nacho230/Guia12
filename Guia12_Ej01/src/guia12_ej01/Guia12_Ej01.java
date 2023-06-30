/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_ej01;

import Entidad.Animal;
import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;

/**
 *
 * @author nacho
 */
public class Guia12_Ej01 {

    /**
     * @param args the command line arguments
     * 
     * Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
     * 
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal perro1 = new Perro("ALCIDES", "Fideos con tuco", 60 ,"BOSTERO");
        perro1.alimentar();
        
        Animal perro2 = new Perro("Chiquito", "Carne", 5,  "Beagle");
        perro2.alimentar();
        
       Animal gato1 = new Gato("Fernando", "Pescado", 10, "GATO");
       gato1.alimentar();
       
       Animal caballo1 = new Caballo("Tiro al blanco", "Pasto", 20, "Caballo");
       caballo1.alimentar();
       
    }
    
}
