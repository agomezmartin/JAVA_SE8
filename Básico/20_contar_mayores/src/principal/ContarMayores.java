package principal;

public class ContarMayores {
	//hacer un programa que cuente cuantos n�meros del array son mayores que num
	//sin tener en cuenta los duplicados!!
	public static void main(String[] args) {
		int[] numeros= {5,10,3,10,8,9,15,8,4,11};
		int num=7;
		int contador=0;
		for(int i=0;i<numeros.length;i++) {
			//si el n�mero del array no est� repetido y es mayor que la variable, incrementamos contador
			if(!comprobarRepetido(i,numeros)&&numeros[i]>num) {
				contador++;
			}
		}
		System.out.println("Total de mayores: "+contador);
	}

	//hacemos un m�todo que recibir� el array y una posici�n del mismo. Lo que har� este m�todo
	//es comprobar si el n�mero que est� en dicha posici�n ya ha aparecido antes en el array
	
	static boolean comprobarRepetido(int pos, int[] nums) {
		boolean resultado=false;
		for(int i=0;i<pos;i++) {
			if(nums[pos]==nums[i]) {
				resultado=true;
				break; //si hemos encontrado repetici�n, abandonamos el for
			}
		}
		return resultado;
	}
}
