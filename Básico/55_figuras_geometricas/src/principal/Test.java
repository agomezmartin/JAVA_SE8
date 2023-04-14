package principal;

import geometria.Circulo;
import geometria.Figura;
import geometria.Triangulo;

//hacer un programa que cree un triangulo y un circulo con valores cualquiera
//y nos muestre color y superficie de cada figura
public class Test {

	public static void main(String[] args) {
		//sin polimorfismo
		/*Circulo circulo=new Circulo("amarillo",4);
		System.out.println("Color de la figura: "+circulo.getColor());
		System.out.println("Superficie: "+circulo.superficie());
		Triangulo triangulo=new Triangulo("verde", 7, 4);
		System.out.println("Color de la figura: "+triangulo.getColor());
		System.out.println("Superficie: "+triangulo.superficie());*/
		//con polimorfismo
		mostrarDatos(new Circulo("rojo",7));
		mostrarDatos(new Triangulo("azul",3,8));
	}
	
	//metodo para polimorfismo
	static void mostrarDatos(Figura figura) {
		System.out.println("Color del "+figura.getClass().getName()+": "+figura.getColor());
		System.out.println("Superficie: "+figura.superficie());
	}

}
