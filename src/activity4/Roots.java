package activity4;

public class Roots {

	private int a;
	private int b;
	private int c;

	public Roots(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminante() {
		return ((b * b) - 4 * a * c);
	}

	public boolean hasRoots() {
		if (getDiscriminante() > 0) {
			return true;
		}
		return false;
	}

	public boolean hasRoot() {
		if (getDiscriminante() == 0) {
			return true;
		}
		return false;
	}

	public void calculate() {

		if (hasRoots()) {
			getRoots();
		} else if (hasRoot()) {
			getRoot();
		} else {
			System.out.println("It dosen't have solution");
		}

	}

	/*Obtenemos las soluciones de las ecuacion de segundo grado que tienen dos soluciones*/
	public void getRoots() {
		System.out.println("x1: " + ((-b + Math.sqrt(getDiscriminante()))/ (2 * a)));
		System.out.println("x2: " + ((-b - Math.sqrt(getDiscriminante()))/ (2 * a)));
	}
	
	/*Obtenemos la solucion de las ecuacion de segundo grado que tienen una solucion*/
	public void getRoot() {
		System.out.println("x: " + ((-b + Math.sqrt(getDiscriminante()))/ (2 * a)));
	}
}
