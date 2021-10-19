package test;

public class Motor {
	//Atributos
	int numeroCilindros;
	String tipo;
	int registro;
	
	//Metodos:
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}
	
	void asignarTipo(String tipo) {
		if (tipo == "electrico" || tipo == "gasolina") {
			this.tipo = tipo;
		}
	}
}
