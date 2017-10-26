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
public class Barco extends VehiculoMaritimo{
    double eslora;
    double calado;

    public Barco(double profundidadMaxima, double velocidadMaxima, double eslora, double calado) {
        super(profundidadMaxima, velocidadMaxima);
        this.eslora=eslora;
        this.calado=calado;
    }
}
