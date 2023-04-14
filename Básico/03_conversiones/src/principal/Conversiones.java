package principal;

public class Conversiones {

	public static void main(String[] args) {
		int data=200;
		double p=data;
		//los caracteres se guardan como enteros
		//por eso se puede convertir implicitamente un char a int
		int a='r';

		double m=23.5;
		int x=(int)m; //elimina la parte decimal
		System.out.println(x);
		//syso + tecla control + barra de espacio
	}

}
