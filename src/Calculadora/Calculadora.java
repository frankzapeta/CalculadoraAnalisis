/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author adiseño.2015
 */
public class Calculadora {
    private int operando;
    private char operador;
    private Calculadora calcu;


    public int getOperando() {
        return operando;
    }

    public char getOperador() {
        return operador;
    }

    public Calculadora getCalcu() {
        return calcu;
    }

    public void setOperando(int operando) {
        this.operando = operando;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public void setCalcu(Calculadora calcu) {
        this.calcu = calcu;
    }
   
    
    
}
