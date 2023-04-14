package service;

import java.util.ArrayList;

public class AgendaService {
	ArrayList<String> agenda=new ArrayList<>();
	public void agregarContacto(String contacto) {
		agenda.add(contacto);
	}
	
	public void eliminar(String contacto) {
		int pos=agenda.indexOf(contacto);
		//si la posición es diferente a -1, entonces el contacto está en la lista
		if(pos!=-1) {
			agenda.remove(pos);
		}
	}
	
	public boolean buscar(String contacto) {
		/*int pos=agenda.indexOf(contacto);
		if(pos!=-1) {
			return true;
		}
		return false;*/
		return agenda.contains(contacto);
	}
	
	public String[] recuperarContactos() {
		/*String [] todos=new String[agenda.size()];
		for(int i=0;i<agenda.size();i++) {
			todos[i]=agenda.get(i);
		}*/
		String [] todos=agenda.toArray(new String[0]);
		return todos;
	}
}
