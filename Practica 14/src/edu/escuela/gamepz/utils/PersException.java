package edu.escuela.gamepz.utils;
public class PersException extends Exception{
private String msg;
private int pos;

public PersException(String msg,int pos){
	super(msg);
	this.pos = pos;
}
public int getPos(){
	return pos;
}
}