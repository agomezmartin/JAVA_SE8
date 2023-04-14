package presentacion;

import java.util.Scanner;

import service.AgendaService;

public class MenuAgenda {
	static AgendaService service= new AgendaService();
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		int opcion;
		do {

			MostrarMenu();

			opcion=sc.nextInt();

			switch (opcion) {
			case 1:
				agregarContacto();
				break;
			case 2:
				eliminarContacto();
				break;
			case 3:
				buscarContacto();
				break;
			case 4:
				mostrarTodos();
				break;
			}

		} while (opcion!=5);
	}

	static void agregarContacto() { // 1. Añadir contacto
		var sc=new Scanner(System.in);
		System.out.println("Introduce contacto: ");
		String nombre=sc.nextLine();
		service.agregarContacto(nombre);
	}
	static void eliminarContacto() { // 2. Eliminar contacto
		var sc=new Scanner(System.in);
		System.out.println("Introduce contacto para eliminar: ");
		String nombre=sc.nextLine();
		service.eliminar(nombre);
	}
	static void buscarContacto() {
		var sc=new Scanner(System.in);
		var nombre=sc.nextLine();
		if(service.buscar(nombre)) {
			System.out.println("El contacto está en la agenda");
		}else {
			System.out.println("El contacto NO está en la agenda");
		}
	}
	static void mostrarTodos() {
		var nombres=service.recuperarContactos();
		for (var nombre:nombres) {
			System.out.print(nombre+", ");
		}
		System.out.println("");
	}
	static void MostrarMenu() {
		System.out.println("1.- Introducir nuevo contacto ");
		System.out.println("2.- Introducir contacto para eliminar");
		System.out.println("3.- Introducir nombre para buscar en Agenda");
		System.out.println("4.- Mostrar todos los contactos");
		System.out.println("5.- Salir");

	}

}
