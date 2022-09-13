/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.calculadora.tipo.operaciones;

import udem.edu.co.calculadora.interfaz.Calculadora;
import udem.edu.co.calculadora.tipo.Cientifica;

/**
 *
 * @author Stebent
 */
public class Grafica extends Cientifica implements Calculadora{
    
    //atributos
    
    private float x;
    private float y;
    
    //Metodo constructor

    public Grafica(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    //Metodo Getter and Setter

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    //metodo toString

    @Override
    public String toString() {
        return "Grafica{" + '}';
    }

    @Override
    public double findValor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
