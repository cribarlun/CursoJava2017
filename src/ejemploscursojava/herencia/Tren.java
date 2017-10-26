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
public class Tren extends VehiculoTerrestre{
    Vagon [] vagones;

    public Tren(double velocidadMaxima, Vagon [] vagones) {
        super(velocidadMaxima);
        this.vagones=vagones;
    }
}
