/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Interfaz.CalculosFormas;

/**
 *
 * @author nacho
 */
public class Circulo extends FormaGeometrica implements CalculosFormas{
    
    private Double radio;
    private Double diametro;

    public Circulo() {
    }

    public Circulo(Double radio, Double diametro, Double area, Double perimetro) {
        super(area, perimetro);
        this.radio = radio;
        this.diametro = diametro;
    }

    //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    @Override
    public Double calcularArea() {

        area = Math.pow(PI * radio, 2);

        System.out.println("El area es:  " + area);
        return area;
    }

    @Override
    public Double calcularPerimetro() {

        perimetro = (PI * diametro);

        System.out.println("El perimetro es: " + perimetro);
        return perimetro;
    }

}
