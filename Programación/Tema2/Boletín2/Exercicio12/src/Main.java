
public class Main {

	public static void main(String[] args) {

		int num1 = 3;
		int num2 = 42;
		int multiplo = 5;
		int resultado = 0;

		for (int i = num1; i <= num2; i++) {
			if (i % multiplo == 0) {
				resultado += i;
			}
		}

		System.out.println("A suma dos multiplos de " + multiplo + " é " + resultado);

	}

}
