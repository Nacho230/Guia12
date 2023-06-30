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
public class Televisor extends Electrodomestico{
    
    Scanner leer = new Scanner(System.in);
    private int resolucion;
    private boolean sintonizador_TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador_TDT, Double precio, Double peso, String color, Character consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    public void setSintonizador_TDT(boolean sintonizador_TDT) {
        this.sintonizador_TDT = sintonizador_TDT;
    }
    
//Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
//padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
//los atributos del televisor.
    public void crearTelevisor() {

        super.crearElectrodomestico();
        System.out.println("Ingrese las pulgadas del televisor: ");
        this.resolucion = leer.nextInt();
        System.out.println("Tiene sintonizador TDT? " + "Si/No");
        String respuesta = leer.next();

        if (respuesta.equalsIgnoreCase("Si")) {
            this.sintonizador_TDT = true;
        } else {
            this.sintonizador_TDT = false;
        }
    }

//    Método precioFinal(): este método será heredado y se le sumará la siguiente
//funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
//incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
//$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
//también deben afectar al precio.
    
    @Override
    public Double precioFinal(){
        
        super.precioFinal();
        if (this.resolucion >= 40) {
            this.precio += (precio*0.3);
        }
        if (this.sintonizador_TDT == true) {
            this.precio += 500;
        }
        
        System.out.println("El precio final del televisor es: $" + this.precio);
        return this.precio;
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizador_TDT=" + sintonizador_TDT  +  ", peso=" + peso + ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + "precio del televisor= " + precio + '}';
    }
    
    
    
}
