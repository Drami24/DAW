
public class Main {

	public static void main(String[] args) {

		int numero = 2;
		int exponente = 10;
		int resultado = 1;

		while (exponente > 0) {
			resultado *= numero;
			exponente--;
		}
		System.out.println("Resultado: " + resultado);

	}

}
