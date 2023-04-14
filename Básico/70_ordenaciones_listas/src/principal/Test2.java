package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Ciudad;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Ciudad> ciudades=new ArrayList<Ciudad>(List.of(new Ciudad("Madrid",30.5),
																 new Ciudad("Avila",20.1),
																 new Ciudad("Sevilla",33.7),
																 new Ciudad("Logroño",19.5)));
		
		//ordena las ciudades y muestralas
		//Collections.sort(ciudades);
		//ordenamos por temperatura
		ciudades.sort((a,b)->a.getTemperatura()>b.getTemperatura()?1:-1);
		//ciudades.sort((a,b)->a.getTemperatura()-b.getTemperatura());
		ciudades.forEach(c->System.out.println(c.getNombre()));
		
		//ordenamos por nombres de ciudades
		ciudades.sort((a,b)->b.getNombre().compareTo(a.getNombre()));
		ciudades.forEach(c->System.out.println(c.getNombre()));
	}

}
