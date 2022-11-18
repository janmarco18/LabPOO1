//paquete de la clase
package edu.escuela.gamepz.personajes.buenos;
//importar el paquete de la clase Personajes
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.utils.*;

public class Planta extends Personaje {
    private Escudo escudo;
    public Planta (String nombre, int vida, Escudo escudo){
        super(nombre,vida,0.0f);
        this.escudo = escudo;
    }
    public Planta (String nombre, Escudo escudo){
        super(nombre,3,0.0f);
        this.escudo = escudo;

    }
    public Planta (String nombre, int vida){
        super(nombre,vida,0.0f);
        this.escudo = Escudo.NULO;
    }
    public Planta (String nombre){
        super(nombre,3,0.0f);
        this.escudo = Escudo.NULO;
    }
    public Escudo getEscudo(){
        return escudo;
    }
    public String toString(){
        return super.toString() + " \t" + escudo.getNivel();
    }
    public void decVida(){
        setVida(getVida() - escudo.getNivel()); 
    }
    public void decVida(int d2){
        setVida(getVida() - (escudo.getNivel() * d2));
    }
    public void addVida(){
        setVida(getVida() + escudo.getNivel());
    }
    public void addVida(int a2){
        setVida(getVida() +(escudo.getNivel() * a2));
    }
}
