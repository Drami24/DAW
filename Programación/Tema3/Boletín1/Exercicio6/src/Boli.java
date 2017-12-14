
public class Boli {

	// Constructor
	public Boli() {
	}

	// Atributo
	private int tinta = 30;

	// Get and Set
	public int getTinta() {
		return tinta;
	}

	public void setTinta(int tinta) {
		this.tinta = tinta;
	}

	// Método
	public void escribirUnNumeroDePalabras(int nPalabras) {
		if (nPalabras <= tinta) {
			System.out.println("Numero de palabras escritas: " + nPalabras);
			this.tinta -= nPalabras;
		} else {
			System.out.println("Non queda tinta suficiente");
		}
	}

}
