package principal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumar("hola"));
		System.out.println(sumar("hola",2,7));
		System.out.println(sumar("hola",7,2,9,6,4));
		System.out.println(sumar("hola",new int[]{6,1,9}));
	}
	
	public static int sumar(String cad,long a,int... nums) {
		int suma=0;
		for(int n:nums) { //se trata como un array
			suma+=n;
		}
		return suma;
	}
	
	public static void print(Persona... personas) {
		
	}

}
