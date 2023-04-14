package principal;

import java.util.Scanner;

//dado un n�mero en una variable, determinar si es o no primo
public class Primos {

	public static void main(String[] args) {
		int num;
		boolean resultado=true; //de momento, suponemos que si es primo
		//solicito n�mero por teclado
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el n�mero");
		num=sc.nextInt();
		
		
		//vamos a recorrer todos los n�meros entre 2 y num
		//y si encontramos una divisi�n exacta, entonces no es primo
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				resultado=false;
				break;//como ya hemos visto que no es primo, no seguimos ejecutando
			}
		}
		
		if(resultado) {
			System.out.println("El n�mero "+num+" es primo");
		}else {
			System.out.println("El n�mero "+num+" no es primo");
		}
		/* if(resultado==true) es lo mismo que if(resultado)
		   if(resultado==false) es lo mismo que if(!resultado)
		 */
		

	}

}
