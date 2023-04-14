package principal;

public class ContarMayores {
	//hacer un programa que cuente cuantos números del array son mayores que num
	//sin tener en cuenta los duplicados!!
	public static void main(String[] args) {
		int[] numeros= {5,10,3,10,8,9,15,8,4,11};
		int num=7;
		int contador=0;
		for(int i=0;i<numeros.length;i++) {
			//si el número del array no está repetido y es mayor que la variable, incrementamos contador
			if(!comprobarRepetido(i,numeros)&&numeros[i]>num) {
				contador++;
			}
		}
		System.out.println("Total de mayores: "+contador);
	}

	//hacemos un método que recibirá el array y una posición del mismo. Lo que hará este método
	//es comprobar si el número que está en dicha posición ya ha aparecido antes en el array
	
	static boolean comprobarRepetido(int pos, int[] nums) {
		boolean resultado=false;
		for(int i=0;i<pos;i++) {
			if(nums[pos]==nums[i]) {
				resultado=true;
				break; //si hemos encontrado repetición, abandonamos el for
			}
		}
		return resultado;
	}
}
