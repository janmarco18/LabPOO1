package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.*;
public class Tablero{
	public static final int MAX_SIZE = 10;
	private Tablero(){};
	static Personaje [] personajes = new Personaje[MAX_SIZE];
	public static void mostrar(){
		System.out.println("\nInicio *** Contenido del arreglo en Tablero");
		int cont = 0;
		for (Personaje p : personajes) {
			if (p == null) {
			System.out.println(cont + "----");	
			}else{
			System.out.println(cont + " " +p);}
			cont += 1;
		}
		System.out.println("Fin ***Contenido del arreglo en Tablero \n");
	}
	public static void insertar(Personaje p, int pos)throws PersException{
		if (pos <= 0 || pos >= MAX_SIZE) {
			throw new PersException("Indice fuera de rango",pos);	
		}
		personajes[pos] = p;
	}	
	public static void borrar(int pos)throws PersException{
		if (pos <= 0 || pos >= MAX_SIZE) {
			throw new PersException("Indice fuera de rango",pos);
		}if (personajes [pos] == null) {
			throw new PersException("Si personaje para borrar",pos);
		}
		personajes [pos] = null;
	}
	public static int genVida(){
		return (int) (Math.random()*10 +1);
	}
}