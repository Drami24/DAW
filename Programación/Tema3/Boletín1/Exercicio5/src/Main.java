
public class Main {

	public static void main(String[] args) {

		Carteira carteira = new Carteira();

		carteira.setCartos(25);
		carteira.setTarxeta(true);

		carteira.disponible();

	}

}
