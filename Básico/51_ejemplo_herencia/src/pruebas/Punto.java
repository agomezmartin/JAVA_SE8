package pruebas;

public class Punto {
	private int x,y;
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public Punto(int a) {
		this.x=a;
		this.y=a;
	}
	public Punto() {
		x=5;
		y=2;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void dibujar() {
		System.out.print("Coordenadas: "+x+","+y);
	}
}
