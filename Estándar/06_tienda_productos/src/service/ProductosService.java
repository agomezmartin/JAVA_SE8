package service;

import java.util.List;
import java.util.stream.Collectors;

import model.Producto;

public class ProductosService {
	List<Producto> productos=List.of(new Producto("pan",1.5,10,"alimentación"),
			new Producto("vino",5.3,5,"alimentación"),
			new Producto("servilletas",1.9,18,"hogar"),
			new Producto("detergente",4.5,20,"hogar"),
			new Producto("pantalla",60.7,3,"informática"),
			new Producto("cerveza",3.2,30,"alimentación"),
			new Producto("bicicleta",150,4,"deportes"));
	
	//total de productos de la sección indicada
	public int totalProductos(String seccion) {
		return productos.stream()
				.filter(p->p.getSeccion().equals(seccion))
				.mapToInt(p->p.getStock()) //genera un IntStream con los stock
				.sum();				
	}
	
	//precio medio de los productos de la sección indicada
	public double precioMedioSeccion(String seccion) {
		return productos.stream()
			.filter(p->p.getSeccion().equals(seccion))
			.mapToDouble(p->p.getPrecio()) //DoubleStream con los precios
			.average() //OptionalDouble
			.orElse(0.0);
	}
	
	//precio del producto más caro
	public double precioMasCaro() {
		return productos.stream()
				.mapToDouble(p->p.getPrecio()) //DoubleStream con los precios
				.max() //OptionalDouble
				.orElse(-1); //devolvemos -1 si no hubiera un máximo
	}
	
	
	//indica si existe el producto recibido como parámetro
	public boolean existeProducto(String nombre) {
		return productos.stream()
				.anyMatch(p->p.getNombre().equals(nombre));
	}
	
	
	//nombre del producto más caro
	public String productoMasCaro() {
		return productos.stream()
				.max((p1,p2)->p1.getPrecio()>p2.getPrecio()?1:-1) //Optional<Producto>
				.get() //Producto
				.getNombre();
	}
	
	
	//devuelva el producto cuyo nombre se recibe como parámetro, si no existe que devuelva null
	public Producto productoNombres(String nombre) {
		return productos.stream()
				.filter(p->p.getNombre().equals(nombre)) //Stream<Producto>
				.findFirst() //Optional<Producto>
				.orElse(null);
	}
	//lista de productos de la sección recibida como parámetro
	public List<Producto> productosSeccion(String seccion){
		return productos.stream()
				.filter(p->p.getSeccion().equals(seccion)) //Stream<Producto>
				.collect(Collectors.toList());
	}
	
	//lista con los nombres de todos los productos, cuyo stock sea superior al valor recibido
	//como parámetro
	public List<String> nombresStock(int min){
		return productos.stream()
				.filter(p->p.getStock()>min) //Stream<Producto>
				.map(p->p.getNombre()) //Stream<String>
				.collect(Collectors.toList()); //List<String>
	}
	
	
}
