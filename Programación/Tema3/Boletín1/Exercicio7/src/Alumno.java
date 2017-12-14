
public class Alumno {

	// constructor
	public Alumno() {
	}
	
	// atributos
	private String nome;
	private String apelidos;
	private int idade;
	
	// get and set
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelidos() {
		return apelidos;
	}

	public void setApelidos(String apelidos) {
		this.apelidos = apelidos;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	// métodos
	public void matricular() {
		System.out.println("O alumno " + this.nome + " acaba de matricularse");
	}
	
	public void baixa() {
		System.out.println("O alumno " + this.nome + " acaba de darse de baixa");
	}
}
