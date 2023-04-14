package principal;

public class IgualdadTextos {

	public static void main(String[] args) {
		String s1=new String("hola");
		String s2=new String("hola");
		if(s1==s2){ //comparamos referencias, no los objetos
			System.out.println("iguales");
		}else{
			 System.out.println("distintos");
		}
		
		//para comparar textos, utilizamos el método equals de String
		if(s1.equals(s2)) {
			System.out.println("iguales");
		}else{
			 System.out.println("distintos");
		}

	}

}
