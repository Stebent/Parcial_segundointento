/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.calculadora.tipo.operaciones;

import udem.edu.co.calculadora.interfaz.Calculadora;
import udem.edu.co.calculadora.tipo.PisaHuevo;

/**
 *
 * @author Stebent
 */
public class Multiplicar extends PisaHuevo implements Calculadora{
    
    // atributos
    
    private int numeromultiplicar1;
    private int numeromultiplicar2;
    
    //metodo constructor

    public Multiplicar(int numeromultiplicar1, int numeromultiplicar2) {
        this.numeromultiplicar1 = numeromultiplicar1;
        this.numeromultiplicar2 = numeromultiplicar2;
    }
    
    
    //metodos getter and setter

    public int getNumeromultiplicar1() {
        return numeromultiplicar1;
    }

    public void setNumeromultiplicar1(int numeromultiplicar1) {
        this.numeromultiplicar1 = numeromultiplicar1;
    }

    public int getNumeromultiplicar2() {
        return numeromultiplicar2;
    }

    public void setNumeromultiplicar2(int numeromultiplicar2) {
        this.numeromultiplicar2 = numeromultiplicar2;
    }
    
    //metodos toString

    @Override
    public String toString() {
        return "{"+"Multiplicar{";
    }

    @Override
    public double findValor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
