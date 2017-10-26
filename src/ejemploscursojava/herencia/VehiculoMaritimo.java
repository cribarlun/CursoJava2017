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
public abstract class VehiculoMaritimo extends Vehiculo{
    double profundidadMaxima;

    public VehiculoMaritimo(double profundidadMaxima, double velocidadMaxima) {
        super(velocidadMaxima);
        this.profundidadMaxima = profundidadMaxima;
    }

    
}
