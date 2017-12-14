import java.util.Scanner;

public class Persoa {

	// constructor
	public Persoa() {
	}

	// atributos
	private String nome;
	private int anoNacemento;

	// método
	public void futuro() {
		Scanner entradaTeclado = new Scanner(System.in);
		int idade2030;

		System.out.println("Introduce o teu nome");
		this.nome = entradaTeclado.next();
		System.out.println("Introduce o teu ano de nacemento");
		this.anoNacemento = entradaTeclado.nextInt();

		idade2030 = 2030 - anoNacemento;

		System.out.println("Ola " + nome + ", no ano 2030 terás " + idade2030 + " anos");
	}
}
