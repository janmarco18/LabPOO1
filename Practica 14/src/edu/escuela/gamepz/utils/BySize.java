package edu.escuela.gamepz.utils;
import edu.escuela.gamepz.personajes.Personaje;
import java.util.Comparator;
public class BySize implements Comparator<Personaje>{
	public int compare(Personaje p1, Personaje p2){
		if (p1.getSize() != p2.getSize()) {
			return (p1.getSize() < p2.getSize()) ? -1 : 1;
		}
		if (p1.getNombre().compareTo(p2.getNombre()) !=0) {
			return (p1.getNombre().compareTo(p2.getNombre()));
		}
		if (p1.getVida() == p2.getVida()) {
			return 0;
		}
		return (p2.getVida()<p1.getVida()) ? -1 : 1;
	}
}