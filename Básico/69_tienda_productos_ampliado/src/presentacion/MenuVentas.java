package presentacion;

import java.util.Scanner;

import service.VentasService;

public class MenuVentas {
	static VentasService service= new VentasService();
	public static void main(String[] args) {
		var sc=new Scanner(System.in);
		int opcion;
		do {

			mostrarMenu();

			opcion=sc.nextInt();

			switch (opcion) {
			case 1:
				agregarVenta();
				break;
			case 2:
				mostrarFacturacion();
				break;
			
			}

		} while (opcion!=3);
	}

	static void agregarVenta() { // 1. A�adir contacto
		var sc=new Scanner(System.in);
		System.out.println("Introduce producto: ");		
		String producto=sc.nextLine();
		System.out.println("Introduce precio: ");
		double precio=Double.parseDouble(sc.nextLine());
		System.out.println("Introduce secci�n: ");
		String seccion=sc.nextLine();
		service.agregarVenta(producto, precio, seccion);
	}
	
	static void mostrarFacturacion() {
		double factura=service.facturacion();		
		System.out.println("La facturaci�n es: "+factura);
	}
	static void mostrarMenu() {
		System.out.println("1.- Nueva venta ");
		System.out.println("2.- Mostrar facturaci�n ");
		//se solicita el nombre de la secci�n, y se eliminan todas las ventas
		//de dicha secci�n
		System.out.println("3.- Eliminar ventas ");
		//se solicita el nombre de la secci�n y el porcentaje de descuento,
		//y se reducira el precio de cada venta de esa secci�n en el porcentaje indicado
		System.out.println("4.- Descuentos ");
		System.out.println("5.- Salir ");
	}

}
