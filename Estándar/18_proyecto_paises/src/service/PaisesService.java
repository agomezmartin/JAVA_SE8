package service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import model.Pais;

public class PaisesService {
	
	String ruta="c:\\temp\\paises.json";
	Pais[] paises;
	public PaisesService() {
		Gson gson=new Gson();
		try {
			paises=gson.fromJson(new FileReader(ruta), Pais[].class);
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	//lista con los nombres de todos los paises
	
	public List<String> nombresPaises(){
		return Arrays.stream(paises) //Stream<Pais>
		.map(p->p.getName()) //Stream<String>
		.collect(Collectors.toList());
	}
	
	//población total del continente cuyo nombre se recibe como parámetro
	
	public long poblacionTotal(String continente) {
		/*return Arrays.stream(paises) //Stream<Pais>
				.filter(p->p.getRegion().equals(continente)) //Stream<Pais>
				.mapToLong(p->p.getPopulation())
				.sum();*/
		//con un reduce
		/*return Arrays.stream(paises) //Stream<Pais>
				.filter(p->p.getRegion().equals(continente)) //Stream<Pais>
				.map(p->p.getPopulation()) //Stream<long>
				.reduce((p1,p2)->p1+p2)
				.orElse(0L);*/
		//con collect
		long t1=System.currentTimeMillis();
		long res= Arrays.stream(paises) //Stream<Pais>
				.filter(p->p.getRegion().equals(continente)) //Stream<Pais>
				.collect(Collectors.summingLong(p->p.getPopulation()));
		long t2=System.currentTimeMillis();
		System.out.println("Ha tardado "+(t2-t1)+" milisegundos");
		return res;
	}
	
	//lista de paises del continente cuyo nombre se recibe como parámetro
	public List<Pais> paisesContinente(String continente){
		return Arrays.stream(paises) //Stream<Pais>
				.filter(p->p.getRegion().equals(continente)) //Stream<Pais>
				.collect(Collectors.toList());
	}
	
	//pais más poblado
	public Pais paisMasPoblado() {
		return Arrays.stream(paises) //Stream<Pais>
			.max((p1,p2)->p1.getPopulation()>p2.getPopulation()?1:-1) //Optional<Pais>
			.orElse(null);
	}
	
	//lista de continentes
	public List<String> nombresContinentes(){
		return Arrays.stream(paises) //Stream<Pais>
				.map(p->p.getRegion()) //Stream<String>
				.distinct()
				.collect(Collectors.toList());
	}
}
