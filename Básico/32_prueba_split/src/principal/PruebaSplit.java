package principal;
//¿Cuantos nombres hay?
public class PruebaSplit {

	public static void main(String[] args) {
		String nombres="paco,alicia,marta.pepe";
		String[] datos=nombres.split("[,.]");
		System.out.println(datos.length);

	}

}
