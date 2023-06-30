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
public class Rectangulo extends FormaGeometrica implements CalculosFormas{
    
    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura, Double area, Double perimetro) {
        super(area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    
    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
    @Override
    public Double calcularArea() {

        area = (base * altura);

        System.out.println("El area es: " + area);
        return area;
    }

    @Override
    public Double calcularPerimetro() {

        perimetro = (base + altura) * 2;

        System.out.println("El perimetro es: " + perimetro);
        return perimetro;
    }

}
