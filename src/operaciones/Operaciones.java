package operaciones;

public class Operaciones {
	private int numero;
	
	
	public Operaciones(int numero) {
		this.numero = numero;
	}
	
	public int cuadrado() {
		return numero * numero;
	}
	public int cubo() {
		return numero * numero * numero;
	}
	public int doble() {
		return numero * 2;
	}
	public int triple() {
		return numero * 3;
	}
	public int polinomio() {
		return (5 *(numero*numero*numero)) + (7 * (numero*numero)) + 9;
	}
	public int polinomioVariable(int a, int b, int c) {
		//a*x^3+b*x^2+c
		return (a * (numero*numero*numero)) + (b * (numero*numero)) + c;
	}
	
	public static void main(String[] args) {
		Operaciones o1 = new Operaciones(2);
		System.out.printf("%nTriple del número");
		System.out.printf("%n------------------%n");
		System.out.println(o1.triple());
		System.out.printf("%nPolinomio varible del número");
		System.out.printf("%n----------------------------%n");
		System.out.println(o1.polinomioVariable(2, 3, 4));
	}
}
