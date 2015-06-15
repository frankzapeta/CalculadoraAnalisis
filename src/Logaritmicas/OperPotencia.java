/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logaritmicas;

/**
 *
 * @author est1534809
 */
public class OperPotencia {
    public float respuesta;
    
    public void setRespuesta(float resp)
    {
        this.respuesta = resp;
    }
    
    public void operacion(float numero, int potencia){
        float num =(float)Math.pow(numero, potencia);
        setRespuesta(num);
    }
}
