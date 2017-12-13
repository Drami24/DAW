
public class Main {

	public static void main(String[] args) {

		int numero = 17;
		int contador = 2;
		boolean primo = true;

		while (contador < numero) {
			if (numero % contador == 0) {
				primo = false;
			}
			contador++;
		}

		if (primo) {
			System.out.println("El número " + numero + " es primo");
		} else {
			System.out.println("El número " + numero + " no es primo");
		}

	}

}
