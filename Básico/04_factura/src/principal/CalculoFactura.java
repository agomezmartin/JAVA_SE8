package principal;

/*Este programa calcula la factura de una venta
  a partir del precio unitario de un producto, las unidades y
  el descuento aplicado		 
*/
public class CalculoFactura {

	public static void main(String[] args) {
		
		double precioProducto=4.6;
		int unidades=7;
		double descuento=3;
		double total=precioProducto*unidades;
		total=total*((100-descuento)/100);
		System.out.println("Total de la factura: "+total);
		
		System.out.println(5.0/6);
	}

}
