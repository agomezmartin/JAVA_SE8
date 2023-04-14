package principal;

import java.util.Scanner;

//realizar un programa que solicite la introducción de un texto. Después,
//el programa indicará el total de vocales de ese texto
public class ContarVocales {

	public static void main(String[] args) {
		String frase;
		int contador=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce texto:");
		frase=sc.nextLine();
		//convertimos todo a minúsculas
		frase=frase.toLowerCase();
		//recorremos todas las letras de la cadena
		for(int i=0;i<frase.length();i++) {
			//recogemos la letra de la posición i y comprobamos
			switch(frase.charAt(i)) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					contador++;
			}
		}
		//mostramos el valor de contador
		System.out.println("El total de vocales es: "+contador);
	}

}
