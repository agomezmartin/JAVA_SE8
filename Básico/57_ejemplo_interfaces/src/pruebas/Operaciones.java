package pruebas;

public interface Operaciones extends Base{
	void girar(int grados);
	int invertir();
	
	//ejemplo de m�todo est�tico en una interfaz que crea una implementaci�n
	//de la misma
	static Operaciones of() {
		//clase an�nima o implementaci�n "al vuelo" de una interfaz
		return new Operaciones() {
			
			@Override
			public void desplazar(int metros) {
				System.out.println("desplaza "+metros+" metros");
				
			}
			
			@Override
			public int invertir() {
				return 10;
			}
			
			@Override
			public void girar(int grados) {
				System.out.println("gira "+grados+" grados");
				
			}
		};
	}
}
