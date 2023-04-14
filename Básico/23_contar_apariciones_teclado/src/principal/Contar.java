package principal;

import java.util.Scanner;

public class Contar {
	//hacer un programa que solicite la introducción de un número y cuente la cantidad de veces
	//que dicho número aparece dentro del array
	public static void main(String[] args) {
		int[] datos= {3,5,1,3,4,9,7,5,3,8,2,1};
		int num;
		int contador=0;
		//solicito número por teclado
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el número");
		num=sc.nextInt();
		
		for(int n:datos) {
			if(n==num) {
				contador++;
			}
		}
		switch(contador) {
			case 0:
				System.out.println("El número "+num+" no está en el array");
				break;
			case 1:
				System.out.println("El número "+num+" aparece una sola vez");
				break;
			default:
				System.out.println("El número de veces que aparece "+num+" en el array es "+contador);
		}
		
	}

}
