/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author nacho
 */
public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setRaza(String raza) {
        super.setRaza(raza); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getRaza() {
        return super.getRaza(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEdad(Integer edad) {
        super.setEdad(edad); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getEdad() {
        return super.getEdad(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAlimento(String alimento) {
        super.setAlimento(alimento); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAlimento() {
        return super.getAlimento(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombre() {
        return super.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }


    
    
 
    
    
    
}
