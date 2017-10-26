/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploscursojava;

/**
 *
 * @author japar
 */
public class ZipiYZape {
    public static void main(String[] args) {
        Alumno zipi=new Alumno("Zipi","Suspenso",3);
        Alumno zape=new Alumno("Zape","Suspenso",3);
        if(zipi==zape){
            System.out.println("Zipi y Zape son en realidad el mismo");
        }else if(zipi.equals(zape)){
            System.out.println("Zipi y Zape son gemelos");
        }else{
            System.out.println("Zipi y Zape no tienen nada que ver");
        }
            
    }
}
