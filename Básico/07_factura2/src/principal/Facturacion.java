package principal;
//calcula la factura de una venta a partir de precio unitario y unidades
//el descuento ser� de 5% si vende m�s de 10 unidades y 2% resto de casos
public class Facturacion {

	public static void main(String[] args) {
		double precioUnitario=3.7;
		int unidades=4;
		double descuento;
		descuento=unidades>10?5.0:2.0;
		//la instrucci�n anterior es equivalente a esto
		if(unidades>10) {
			descuento=5.0;
		}else {
			descuento=2.0;
		}
	}

}
