public class Procesos{
	ArrayList lista
	private Procesos(){}

	private void llenaTxArea(JTextArea txContenido){
	}

	public void addTerrestre(JTextArea txContenido, JTextField marca, JTextField modelo,
		JTextField costo, JTextField llantas){
	}

	public void addAcuatico(JTextArea txContenido, JTextField marca, JTextField modelo,
		JTextField costo, JTextField remos){
	}


	public void sortMarca(JTextArea txContenido){
		//ordenar PorMarca
		llenaTxArea(txContenido);
	}

	public void sortModelo(JTextArea txContenido){
		//ordenar PorModelo
		llenaTxArea(txContenido);
	}

	public void sortCosto(JTextArea txContenido){
		//ordenar PorCosto
		llenaTxArea(txContenido);
	}
}