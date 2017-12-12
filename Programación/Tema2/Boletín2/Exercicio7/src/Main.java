
public class Main {

	public static void main(String[] args) {

		int num = 7;
		int multiplicador = 3;
		int resultado = 0;

		while (multiplicador > 0) {
			resultado += num;
			multiplicador--;
		}

		System.out.println(resultado);
	}

}
