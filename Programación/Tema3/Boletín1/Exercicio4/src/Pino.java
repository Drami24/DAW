
public class Pino {

	// constructor
	public Pino() {
	}

	// atributo
	private int altura;

	// get and set
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	// métodos
	public void cortar(int corte) {
		this.altura -= corte;
	}

}
