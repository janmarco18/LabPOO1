package edu.escuela.gamepz.pruebas;
import edu.escuela.gamepz.personajes.*;
import edu.escuela.gamepz.personajes.malos.*;
import edu.escuela.gamepz.personajes.buenos.*; 
import edu.escuela.gamepz.utils.*;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

public class PruebaColeccion{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String path = System.getProperty("user.home") + System.getProperty("file.separator");
		String suma = path + fname;
		String fname = "" ;
			fname = s.nextLine();
		
		File f = new File(path);


		if(f.exists()){
			System.out.println("Archivo o directorio si existe");
			return; 
		}

		if(f.isDirectory()){
			mostrarDirectorio();
			return;
		}

		Personaje [] datos = {
			new Planta("Fabian",Tablero.genVida(),Escudo.MEDIO),
			new Planta("Bianca",Tablero.genVida()),
			new Planta("Fabian",Tablero.genVida()),
			new Planta("Armando",Tablero.genVida(),Escudo.BAJO),
			new Zombie("Bianca",Tablero.genVida()),
			new Planta("Dayan",Tablero.genVida()),
			new Zombie("Armando",Tablero.genVida(),false),
			new Zombie("Dayan",Tablero.genVida(),true),
			new Zombie("Armando",Tablero.genVida())
			};
		TreeSet <Personaje> arbol = new TreeSet<>();
		LinkedList<Personaje> lista = new LinkedList<Personaje>();
		for (Personaje personajes : datos) {
			arbol.add(personajes);
		}
		lista.addAll(arbol);
		System.out.println(" - - - Orden Natural - - - ");
		for (Personaje p:arbol){
		System.out.println(p);
		}
		System.out.println(" - - - Orden Vida - - - ");
		Collections.sort(lista,new ByVida());
		for (Personaje p:lista){
		System.out.println(p);
		}
		ArrayList<Personaje> arr = new ArrayList<Personaje>();
		arr.addAll(lista);
		System.out.println(" - - - Orden Tamanio - - - ");
		Collections.sort(arr, new BySize());
		for (Personaje p:arr){
		System.out.println(p); }
		
		}

	public static void guardarObjetos(File f, TreeSet <Personaje> arbol){
	};
	public static void mostrarDirectorio(File f){
			f.getPath();

	}
}