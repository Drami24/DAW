
public class Main {

	public static void main(String[] args) {

		int numero = 2;
		int resultado = 1;

		for (int exponente = 10; exponente > 0; exponente--) {
			resultado *= numero;
		}

		System.out.println("Resultado: " + resultado);
	}

}
