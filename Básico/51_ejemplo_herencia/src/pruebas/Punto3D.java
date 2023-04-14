package pruebas;

public class Punto3D extends Punto{
	private int z;
	public Punto3D(int x, int y, int z) {
		super(x,y); //llamada al constructor de la clase padre: Punto(int x, int y)
		this.z=z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	//sobrescribimos el m�todo dibujar para que est� completo
	public void dibujar() {
		//System.out.println("Coordenadas: "+getX()+","+getY()+","+z);
		super.dibujar(); //llamada al m�todo original de la superclase
		System.out.print(","+z);
	}
	
}
