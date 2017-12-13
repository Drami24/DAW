
public class Main {

	public static void main(String[] args) {
		
		int num1 = 42;
		int num2 = 3;
		int multiplo = 5;
		int resultado = 0;

		if (num1 > num2) {
			System.out.println("Erro, o número1 é mais grande que o número2");
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
