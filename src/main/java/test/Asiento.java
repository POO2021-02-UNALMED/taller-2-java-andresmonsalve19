package test;

public class Asiento {
	//Atributos
	String color;
	int precio;
	int registro;
	
	//Metodos
	void cambiarColor(String color) {
		String colores[] = {"rojo", "verde", "amarillo", "negro", "blanco"}; 
		
		if (color == colores[0] || color == colores[1] || color == colores[2] || color == colores[3] || color == colores[4]) {
			this.color = color;
		}
	}

}
