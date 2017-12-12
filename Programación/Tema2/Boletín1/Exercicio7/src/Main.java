
public class Main {

	public static void main(String[] args) {

		double cateto1 = 5;
		double cateto2 = 7;
		double hipotenusa;

		// Usando potencias e raices
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

		// Outra forma de facelo
		 hipotenusa = Math.hypot(cateto1, cateto2);

		System.out.println(hipotenusa);

	}

}
