//Paquete de la clase personaje(contiene la ruta de las carpetas)
package edu.escuela.gamepz.personajes; 
import java.text.DecimalFormat;

public abstract class Personaje implements Comparable<Personaje>{
	private String nombre;
	protected int vida;
	private float size;
		public Personaje (String nombre, int vida, float size){
		this.nombre = nombre;
		this.vida = vida;
		this.size = size;
		if (size == 0.0f) {
			this.size = genSize();
		}else{
			this.size = Math.round(size)/100;
		}
	}
	public Personaje(String nombre){
		this(nombre,3,0.0f);
	}
	public int compareTo(Personaje p){
	if (this.nombre.compareTo(p.nombre) !=0) {
			return (this.nombre.compareTo(p.nombre));
		}
		if (this.vida != p.vida) {
				return p.vida - this.vida;
			}	
		if (this.size == p.size) {
			return 0;
		}
		return (p.size < this.size) ? -1 : 1;
	}
	public void setNombre(String nombre){
		int length = nombre.length();
		if (length>5 && length<25){
		this.nombre = nombre;
	}
	}
	public boolean setVida(int vida){
		if (vida>0 && vida<99){
			this.vida = vida;
			return true;
		}else{
			return false;
		} 
	}
	public String getNombre(){
		return nombre;
	}
	public int getVida(){
		return vida;
	}
	public float getSize(){
		return size;
	}
	public String toString(){
		return nombre + "\t " + "\t" + vida + "\t" + size;
	}
	public float genSize(){
		float size = (float)(Math.random()*10);
		DecimalFormat df = new DecimalFormat("#.00");
		size = Float.valueOf(df.format(size));
		return size;
	}
	public abstract void decVida();
	public abstract void decVida(int d);
	public abstract void addVida();
	public abstract void addVida(int a);
}

//javac -d ..\classes edu\escuela\gamepz\pruebas\PruebaHerencia.java
//java -cp ..\classes edu\escuela\gamepz\pruebas\PruebaHerencia 