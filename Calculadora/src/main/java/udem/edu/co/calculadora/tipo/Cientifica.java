/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.calculadora.tipo;

/**
 *
 * @author Stebent
 */
public abstract class Cientifica {
    
    //atributos
    
    private double ejex;
    private double ejey;
    
    //metodo constructor

    public Cientifica() {
        this.ejex = 2.0;
        this.ejey = 3.0;
    }
    
    //Metodos getter and Setter

    public double getEjex() {
        return ejex;
    }

    public void setEjex(double ejex) {
        this.ejex = ejex;
    }

    public double getEjey() {
        return ejey;
    }

    public void setEjey(double ejey) {
        this.ejey = ejey;
    }

    
    // metodo toString
    
    @Override
    public String toString() {
        return "Cientifica{" + '}';
    }
    
    
    
    
    
}
