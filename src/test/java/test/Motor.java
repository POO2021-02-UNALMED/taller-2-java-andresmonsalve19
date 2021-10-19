package test;

public class Motor {
	//Atributos
	int numeroCilindros;
	String tipo;
	static int registro;
	
	//Metodos:
	void cambiarRegistro(int registro) {
		Motor.registro = registro;
	}
	
	void asignarTipo(String tipo) {
		if (tipo == "electrico" || tipo == "gasolina") {
			this.tipo = tipo;
		}
	}
}
