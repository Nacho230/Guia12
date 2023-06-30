/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia12_ej04;

import Entidad.Circulo;
import Entidad.FormaGeometrica;
import Entidad.Rectangulo;
import Interfaz.CalculosFormas;
import utilidad.UTILIDAD;

/**
 *
 * @author nacho
 */
public class Guia12_Ej04 {

    /**
     * @param args the command line arguments
     * Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UTILIDAD u1 = new UTILIDAD();
        Circulo c1 = new Circulo(10.5, 20.0, 5.0, 7.0);
        Rectangulo r1 = new Rectangulo(10d, 20d, 25.5, 15.5);
   
        System.out.println("Construyendo circulo...");
        System.out.println("");
        
       u1.esperar(1);
        System.out.println("        0   0         ");
        u1.esperar(1);
        System.out.println("      0       0        ");
        u1.esperar(1);
        System.out.println("     0         0     ");
        u1.esperar(1);
        System.out.println("     0         0      ");
        u1.esperar(1);
        System.out.println("      0       0        ");
        u1.esperar(1);
        System.out.println("        0   0          ");
        System.out.println("");
        u1.esperar(2);
        
        System.out.println("Calculando area...");
        u1.esperar(2);
        c1.calcularArea();
        u1.esperar(2);
        System.out.println("Calculando perimetro... ");
        u1.esperar(2);
        c1.calcularPerimetro();
        u1.esperar(2);
      
        System.out.println("");
        System.out.println("Construyendo rectangulo... ");
        u1.esperar(1);
        System.out.println("");
        u1.esperar(1);
        System.out.println("|-----------------------|");
        u1.esperar(1);
        System.out.println("|                       |");
        u1.esperar(1);
        System.out.println("|                       |");
        u1.esperar(1);
        System.out.println("|                       |");
        u1.esperar(1);
        System.out.println("|-----------------------|");
        System.out.println("");
        
        u1.esperar(1);
        System.out.println("Calculando area... ");
        u1.esperar(2);
        r1.calcularArea();
        u1.esperar(2);
        System.out.println("Calculando perimetro... ");
        u1.esperar(2);
        r1.calcularPerimetro();
        
    }
    
}
