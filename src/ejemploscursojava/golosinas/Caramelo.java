/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava.golosinas;

import java.util.Objects;

/**
 *
 * @author japar
 */
public class Caramelo {
    String marca;
    String sabor;

    public Caramelo(String marca, String sabor) {
        this.marca = marca;
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Caramelo{" + "marca=" + marca + ", sabor=" + sabor + '}';
    }

    public String getMarca() {
        return marca;
    }

    public String getSabor() {
        return sabor;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.marca);
        hash = 53 * hash + Objects.hashCode(this.sabor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Caramelo other = (Caramelo) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.sabor, other.sabor)) {
            return false;
        }
        return true;
    }
    
    
    
}
