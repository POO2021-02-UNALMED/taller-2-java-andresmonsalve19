package test;

public class Auto {
	//Atributos
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
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
		
		if (this.registro != asientos[0].registro || this.registro != motor.registro || asientos[0].registro != motor.registro) {
			cadena = "Las piezas no son originales";
		}
		else {
			cadena = "Auto original";
		}
		
		return cadena;
	}
}
