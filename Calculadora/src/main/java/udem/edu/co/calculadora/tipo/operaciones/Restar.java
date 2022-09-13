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
public class Restar extends PisaHuevo implements Calculadora{
    
    //atributos
    
    private int numeroresta1;
    private int numeroresta2;
    
    //metodo constructor

    public Restar(int numeroresta1, int numeroresta2) {
        this.numeroresta1 = numeroresta1;
        this.numeroresta2 = numeroresta2;
    }
    
    //Metodos Getter and Setter

    public int getNumeroresta1() {
        return numeroresta1;
    }

    public void setNumeroresta1(int numeroresta1) {
        this.numeroresta1 = numeroresta1;
    }

    public int getNumeroresta2() {
        return numeroresta2;
    }

    public void setNumeroresta2(int numeroresta2) {
        this.numeroresta2 = numeroresta2;
    }

    
    // metodo toStrng
    
    @Override
    public String toString() {
        return "{Restar{" +"a:"+getNumeroresta1()+"b:"+getNumeroresta2() +"}";
    }

    @Override
    public double findValor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
