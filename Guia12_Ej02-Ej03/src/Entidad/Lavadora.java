/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Lavadora extends Electrodomestico{

    Scanner leer = new Scanner(System.in);
    private Double carga; 
    
    
    public Lavadora() {
    }


    public Lavadora(Double carga, Double precio, Double peso, String color, Character consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

//    Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//el atributo propio de la lavadora.
    public void crearLavadora() {
        super.crearElectrodomestico();

        System.out.println("Ingrese la cantidad de carga: ");
        this.carga = leer.nextDouble();


    }

//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
//carga es menor o igual, no se incrementará el precio. Este método debe llamar al
//método padre y añadir el código necesario. Recuerda que las condiciones que hemos
//visto en la clase Electrodoméstico también deben afectar al precio.    
    @Override
    public Double precioFinal() {
        super.precioFinal();
        if (this.carga > 30) {
            this.precio += 500;
        }
        
        System.out.println("El precio final de la lavadora es: $" + this.precio);
        return this.precio;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga  + ", peso=" + peso + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + "precio de la lavadora= " + precio +'}';
    }

 
    
    
}
