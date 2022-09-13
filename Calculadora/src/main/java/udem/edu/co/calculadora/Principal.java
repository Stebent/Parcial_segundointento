/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package udem.edu.co.calculadora;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.calculadora.interfaz.Calculadora;
import udem.edu.co.calculadora.tipo.operaciones.Grafica;
import udem.edu.co.calculadora.tipo.operaciones.Restar;
import udem.edu.co.calculadora.tipo.operaciones.Sumar;

/**
 *
 * @author Stebent
 */
public class Principal {

    public static void main(String[] args) {
          List<Calculadora> calcular=new ArrayList<Calculadora>();
          
          Calculadora operacion1 = new Sumar(2, 4);
          Calculadora operacion2 = new Restar(20, 10);
          Calculadora operacion3 = new Grafica(2, 5);
          calcular.add(operacion1);
          calcular.add(operacion2);
          calcular.add(operacion3);
          System.out.println(calcular);
          
          
          
    }
}
