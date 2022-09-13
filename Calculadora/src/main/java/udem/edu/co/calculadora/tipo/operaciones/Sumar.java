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
public class Sumar extends PisaHuevo implements Calculadora{
    
    //atributos
    
    private int numero1;
    private int numero2;
    
    //Metodo constructor

    public Sumar(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    //Metodos Getter and Setter

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //Metodo toString

    @Override
    public String toString() {
        return "{Sumar{" +"a:"+getNumero1()+"b:"+getNumero2() +"}}";
    }

    @Override
    public double findValor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
