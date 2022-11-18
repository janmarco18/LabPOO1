package edu.escuela.gamepz.utils;
public enum Escudo{
	SUPER(3),
	MEDIO(2),
	BAJO(1),
	NULO(0);

	private int nivel;

	private Escudo(int nivel){
		this.nivel = nivel;
	}

	public int getNivel(){
		return nivel;
	}
}