import java.util.Scanner;

public class NotaAlumno {

	// constructor
	public NotaAlumno() {
		this.almacenarNotas();
	}

	// atributos
	private int[] notas = new int[10];
	private String[] alumnos = new String[10];

	// métodos
	private void almacenarNotas() {
		Scanner entradaTeclado = new Scanner(System.in);

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Introduce o nome do alumno " + (i + 1));
			alumnos[i] = entradaTeclado.next();
			System.out.println("Introduce a nota do alumno " + (i + 1));
			notas[i] = entradaTeclado.nextInt();
		}
	}

	public String maior() {
		int resultado = 0;
		String nome = "";

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > resultado) {
				resultado = notas[i];
				nome = alumnos[i];
			}
		}
		return nome;
	}

	public String menor() {
		int resultado = 10;
		String nome = "";

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < resultado) {
				resultado = notas[i];
				nome = alumnos[i];
			}
		}
		return nome;
	}

}
