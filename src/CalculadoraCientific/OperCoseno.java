/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraCientific;

import Operacion.Operacion;

/**
 *
 * @author adiseño.2015
 */
public class OperCoseno extends CalculadoraCientifica implements Operacion{

    public Float respuesta;

    public Float getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(Float respuesta) {
        this.respuesta = respuesta;
    }
    
    @Override
    public void operacions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
