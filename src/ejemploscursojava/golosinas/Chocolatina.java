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
public class Chocolatina {
       String marca;
       String chocolate;

    public Chocolatina(String marca, String tipoChocolate) {
        this.marca = marca;
        this.chocolate=tipoChocolate;
    }

    @Override
    public String toString() {
        return marca+"(Chocolate: "+chocolate+")";
    }

    public String getMarca() {
        return marca;
    }

    public String getChocolate() {
        return chocolate;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.marca);
        hash = 23 * hash + Objects.hashCode(this.chocolate);
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
        final Chocolatina other = (Chocolatina) obj;
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.chocolate, other.chocolate)) {
            return false;
        }
        return true;
    }


    
       
    
     
}
