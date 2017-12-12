
public class Main {

	public static void main(String[] args) {

		double x2 = 3;
		double x = 5;
		double n = 1;

		double raiz = Math.sqrt(Math.pow(x, 2) - (4 * x2 * n));

		double resultado1 = (-x + raiz) / (2 * x2);
		double resultado2 = (-x - raiz) / (2 * x2);

		System.out.println("Solución 1: " + resultado1);
		System.out.println("Solución 2: " + resultado2);

	}

}
