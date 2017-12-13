
public class Main {

	public static void main(String[] args) {

		int num1 = 42;
		int num2 = 3;
		int multiplo = 5;
		int resultado = 0;
		int num1b;
		int num2b;
		
		if (num1 > num2) {
			// Cambiamos o valor de num1 por num2 e viceversa
			num1b = num2;
			num2b = num1;
			num1 = num1b;
			num2 = num2b;

			for (int i = num1; i <= num2; i++) {

				if (i % multiplo == 0) {
					resultado += i;
				}
			}
			System.out.println("A suma dos multiplos de " + multiplo + " é " + resultado);

		} else {
			for (int i = num1; i <= num2; i++) {

				if (i % multiplo == 0) {
					resultado += i;
				}
			}
			System.out.println("A suma dos multiplos de " + multiplo + " é " + resultado);
		}

	}

}
