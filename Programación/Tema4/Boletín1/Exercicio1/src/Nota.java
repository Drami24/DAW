import java.util.Scanner;

public class Nota {

	// constructor
	public Nota() {
	}

	// atributos
	private int[] notas = new int[10];

	// métodos
	private void introducirNotas() {
		Scanner entradaTeclado = new Scanner(System.in);

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduce a nota do alumno " + (i + 1));
			notas[i] = entradaTeclado.nextInt();
		}
	}

	public int calcularMedia() {
		this.introducirNotas();
		int resultado = 0;
		int notaMedia = 0;

		for (int i = 0; i < notas.length; i++) {
			resultado += notas[i];
			notaMedia = resultado / notas.length;
		}
		return notaMedia;
	}
}
