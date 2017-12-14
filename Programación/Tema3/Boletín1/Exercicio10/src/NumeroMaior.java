import java.util.Scanner;

public class NumeroMaior {

	// constructor
	public NumeroMaior() {
	}

	// método
	public int maior() {
		Scanner entradaTeclado = new Scanner(System.in);
		int numero;
		int resultado = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Introduce o número " + (i + 1));
			numero = entradaTeclado.nextInt();

			if (numero > resultado) {
				resultado = numero;
			}
		}
		return resultado;
	}
}
