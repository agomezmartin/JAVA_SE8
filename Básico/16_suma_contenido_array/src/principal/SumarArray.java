package principal;

public class SumarArray {

	public static void main(String[] args) {
		int[] numeros= {7,-3,11,21,-9,28};
		//mostrar la suma de todos los números del array
		int suma=0;
		for(int i=0;i<numeros.length;i++) {
			//vamos acumulando en suma todos los datos del array, uno por uno
			suma=suma+numeros[i];
		}
		System.out.println("La suma total es: "+suma);

	}

}
