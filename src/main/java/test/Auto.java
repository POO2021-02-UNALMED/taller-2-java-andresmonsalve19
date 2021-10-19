package test;

public class Auto {
	//Atributos
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	static int registro;
	static int cantidadCreados;
	
	//Metodos
	int cantidadAsientos() {
		int numeroAsientos = 0;
		
		for (int i=0; i<asientos.length; i++) {
			if (asientos[i] instanceof Asiento) {
				numeroAsientos++;
			}
		}
		
		return numeroAsientos;
	}
	
	String verificarIntegridad() {
		String cadena;
		
		if (Auto.registro != Asiento.registro || Auto.registro != Motor.registro || Asiento.registro != Motor.registro) {
			cadena = "Las piezas no son originales";
		}
		
		cadena = "Auto original";
		
		return cadena;
	}
}
