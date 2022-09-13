/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.calculadora.tipo;

/**
 *
 * @author Stebent
 */
public abstract class PisaHuevo {
    
    private int a;
    private int b;
    
    //metodo constructor

    public PisaHuevo() {
        this.a = 20;
        this.b = 20;
    }
    
    //metoos getter and setter

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    // metod toString

    @Override
    public String toString() {
        return "PisaHuevo{" + '}';
    }
    
    
    
}
