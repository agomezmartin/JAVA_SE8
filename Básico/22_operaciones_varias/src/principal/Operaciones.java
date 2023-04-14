package principal;

//dados dos numeros, hacer un programa que muestre la suma de los números, la multiplicación de los números
//y el factorial de cada número

public class Operaciones {

	public static void main(String[] args) {
		int a=5;
		int b=8;
		int s=sumar(a,b);
		System.out.println("La suma es "+s);
		System.out.println("La multiplicación es: "+multiplicar(a,b));
		System.out.println("El factorial de "+a+" es:"+factorial(a));
		System.out.println("El factorial de "+b+" es:"+factorial(b));
	}
	
	static int sumar(int x, int y) {
		int result=x+y;
		return result;
	}
	static int multiplicar(int x, int y) {
		return x*y;
	}
	
	static int factorial(int n) {
		int res=1;
		for(int i=1;i<=n;i++) {
			res=res*i;
		}
		return res;
	}
	

}
