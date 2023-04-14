package principal;

import java.util.Scanner;

//realizar un programa que calcule el precio final de la compra de un dominio de internet
//se solicita al usuario la introducción del dominio que quiere. Todos los dominios, tienen 
//un precio base de 20 euros. Pero, si el dominio es .com, se añade un suplemento del 5%, si es
//.org un descuento del 5%

public class DominiosInternet {

	public static void main(String[] args) {
		final double precioBase=20;
		double total;
		String dominio;
		int posPunto;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce dominio que quieres comprar: ");
		dominio=sc.nextLine();
		dominio=dominio.trim(); //elimina posibles espacios a izquierda y derecha del texto
		if(dominio.startsWith("www.")) {
			posPunto=dominio.lastIndexOf(".");
			switch(dominio.substring(posPunto+1)) { //esto devuelve com, org, o lo que sea
				case "org":
					total=precioBase-precioBase*5.0/100;
					break;
				case "com":
					total=precioBase+precioBase*5.0/100;
					break;
				default:
					total=precioBase;	
			}
			System.out.println("El precio es: "+total);
		}else {
			System.out.println("Dominio no válido");
		}
		

	}

}
