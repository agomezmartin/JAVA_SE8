package presentacion;

import java.util.List;

import service.OperacionesService;

public class ProgramaNumeros {

	public static void main(String[] args) {
		List<Integer> lista=List.of(8,-1,-9,14,7,-2,10);
		OperacionesService service=new OperacionesService();
		//primera operaci�n
		service.procesaLista(lista,
							 n->n%2==0, 
							 n->n*n,
							 n->System.out.println(n));
		//segunda operaci�n
		service.procesaLista(lista,
				n->n>0, 
				n->(int)Math.sqrt(n),
				n->System.out.println(n));
		
		
		//////////////////otra versi�n del m�todo
		List<Integer> resultado=service.procesaLista(lista, n->n%2==0, n->n*n);
		resultado.forEach(n->System.out.println("el cuadrado es "+n));
	}

}
