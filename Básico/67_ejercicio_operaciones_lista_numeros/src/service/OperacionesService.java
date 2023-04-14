package service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class OperacionesService {
	public void procesaLista(List<Integer> lista,
							 Predicate<Integer> condicion,
							 UnaryOperator<Integer> tx,
							 Consumer<Integer> proceso) {
		lista.forEach(n->{
			if(condicion.test(n)) {
				proceso.accept(tx.apply(n));
			}
		});
	}
	public List<Integer> procesaLista(List<Integer> lista,
										Predicate<Integer> condicion,
										UnaryOperator<Integer> tx) {
		ArrayList<Integer> aux=new ArrayList<Integer>();
		lista.forEach(n->{
			if(condicion.test(n)) {
				aux.add(tx.apply(n));
			}
		});
		return aux;
}	
	
}
