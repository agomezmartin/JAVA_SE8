package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import model.Ciudad;

public class Test2 {

	public static void main(String[] args) {
		ArrayList<Ciudad> ciudades=new ArrayList<Ciudad>(List.of(new Ciudad("Madrid",30.5),
																 new Ciudad("Avila",20.1),
																 new Ciudad("Sevilla",33.7),
																 new Ciudad("Logroño",19.5)));
		/*
		//ordena las ciudades y muestralas
		//Collections.sort(ciudades);
		//ordenamos por temperatura
		ciudades.sort((a,b)->a.getTemperatura()>b.getTemperatura()?1:-1);
		//ciudades.sort((a,b)->a.getTemperatura()-b.getTemperatura());
		ciudades.forEach(c->System.out.println(c.getNombre()));
		
		//ordenamos por nombres de ciudades
		ciudades.sort((a,b)->b.getNombre().compareTo(a.getNombre()));
		ciudades.forEach(c->System.out.println(c.getNombre()));
		*/
		
		//¿Cuantas ciudades tienen una temperatura superior a 25 grados?
		System.out.println(ciudades.stream()
			.filter(c->c.getTemperatura()>25)
			.count());
		
		//Mostrar los nombres de las ciudades con temperatura superior a 25 grados
		ciudades.stream()
			.filter(c->c.getTemperatura()>25)
			.forEach(c->System.out.println(c.getNombre()));
		
		
		//Nombre de la ciudad más fría
		System.out.println(ciudades.stream()
				.min((c1,c2)->c1.getTemperatura()>c2.getTemperatura()?1:-1)
				.get()
				.getNombre());
		//Temperatura media de todas las ciudades
		System.out.println(ciudades.stream()
				.mapToDouble(c->c.getTemperatura())  //DoubleStream
				.average()
				.orElse(0));
		//¿Existe la ciudad Santander?
		System.out.println(ciudades.stream()
				.anyMatch(c->c.getNombre().equals("Santander"))?"Sí":"No");
		//¿Todas las ciudades superan los 20 grados?
		System.out.println(ciudades.stream()
				.allMatch(c->c.getTemperatura()>20)?"Sí":"No");
		
		//Temperatura de la ciudad de Sevilla, si no existe, que diga que no existe
		ciudades.stream()
		.filter(c->c.getNombre().equals("Málaga")) //Stream<Ciudad>
		.findFirst()  //Optional<Ciudad>
		.ifPresentOrElse(c->System.out.println(c.getTemperatura()), ()->System.out.println("No existe la ciudad"));
		
		
		
		//transforma la lista en un conjunto
		
		Set<Ciudad> conjunto=ciudades.stream()
								.collect(Collectors.toSet());
	}

}
