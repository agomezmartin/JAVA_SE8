package principal;

public class SumaMil {

	public static void main(String[] args) {
		int suma=0;
		int contador=0;
		final int limite=1000; //es una constante
		while(suma<limite) {
			/*contador++;
			suma=suma+contador;	*/
			suma=suma+(++contador);
		}
		
		System.out.println("Hemos tenido que sumar hasta el "+contador);
	}

}
