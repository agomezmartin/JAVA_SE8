package principal;

import java.util.ArrayList;

public class PruebasListas {

	public static void main(String[] args) {
		ArrayList<Integer> lista=new ArrayList<Integer>();
		lista.add(12);lista.add(3);lista.add(7);lista.add(8);lista.add(5);lista.add(24);
		
		//recorrido de la lista con programación clásica
		for(int num:lista) {
			System.out.println(num);
		}
		
		//con programación funcional
		lista.forEach(n->System.out.println(n));
		
		
		//eliminar de la lista los menores de 10. Programación clásica
		/*for(int num:lista) {
			if(num<10) {
				lista.remove(num);
			}
		}*/
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i)<10) {
				lista.remove(i);
			}
		}
		
		//con programación funcional:
		lista.removeIf(n->n<10);
		
		
		//sustituir cada elemento de la lista por su cuadrado. Programación clásica
		for(int i=0;i<lista.size();i++) {
			lista.set(i, lista.get(i)*lista.get(i));
		}
		
		//programación funcional
		lista.replaceAll(n->n*n);
		

	}

}
