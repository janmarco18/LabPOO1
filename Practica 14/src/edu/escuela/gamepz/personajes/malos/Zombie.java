//paquete de la clase zombie
package edu.escuela.gamepz.personajes.malos;
//importar el paquete de la clase personaje
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.utils.*;

public class Zombie extends Personaje implements Muerto{
    private boolean ataque;
    public Zombie (String nombre, int vida, boolean ataque){
        super(nombre,vida,0.0f);
        this.ataque = ataque;
    }
    public Zombie (String nombre, boolean ataque){
        super(nombre,3,0.0f);
        this.ataque = ataque;
    }
    public Zombie (String nombre){
        super(nombre,3,0.0f);
        this.ataque = false;
    }  
    public Zombie (String nombre, float size){
        super(nombre,3,size);
    }
    public boolean getAtaque(){
        return ataque;
    }
    public String toString(){
        return super.toString() + " " + ataque;
    }
    public void decVida(){
        if (ataque == false) {
            setVida(getVida() - (1*3));
        }else{
            setVida(getVida() - (1));
        }
    }
    public void decVida(int d3){
        if (ataque == false) {
            setVida(getVida() - (d3*3));
        }else{
             setVida(getVida() - (d3));
        }
    }
    //Método addVida
    public void addVida(){
        if (ataque == true) {
             setVida(getVida() + (1*3));
        }
    }
    public void addVida(int a3){
        if (ataque == true) {
            setVida(getVida() + (a3*3));
        }
    }
    public void comer(){
        System.out.println("Come cerebros");
    }

}