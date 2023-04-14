package principal;

import java.util.Scanner;

//dado un número en una variable, determinar si es o no primo
public class Primos {

	public static void main(String[] args) {
		int num;
		boolean resultado=true; //de momento, suponemos que si es primo
		//solicito número por teclado
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el número");
		num=sc.nextInt();
		
		
		//vamos a recorrer todos los números entre 2 y num
		//y si encontramos una división exacta, entonces no es primo
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				resultado=false;
				break;//como ya hemos visto que no es primo, no seguimos ejecutando
			}
		}
		
		if(resultado) {
			System.out.println("El número "+num+" es primo");
		}else {
			System.out.println("El número "+num+" no es primo");
		}
		/* if(resultado==true) es lo mismo que if(resultado)
		   if(resultado==false) es lo mismo que if(!resultado)
		 */
		

	}

}
