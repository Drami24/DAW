
public class Main {

	public static void main(String[] args) {

		int numero = 5;
		int factorial = 1;

		while (numero > 1) {
			factorial *= numero;
			numero--;

		}

		System.out.println("El factorial es: " + factorial);
	}

}
