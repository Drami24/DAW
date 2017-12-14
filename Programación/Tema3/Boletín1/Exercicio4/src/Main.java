
public class Main {

	public static void main(String[] args) {

		Pino pino = new Pino();

		pino.setAltura(12);
		pino.cortar(5);

		System.out.println("Altura final do pino: " + pino.getAltura());

	}

}
