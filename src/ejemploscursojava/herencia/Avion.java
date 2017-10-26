/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava.herencia;

/**
 *
 * @author japar
 */
public class Avion extends VehiculoAereo {
    protected int alas;

    public Avion(double alturaMaxima, double velocidadMaxima, int alas) {
        super(alturaMaxima, velocidadMaxima);
        this.alas=alas;
    }
    
}
