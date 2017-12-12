
public class Main {

	public static void main(String[] args) {

		int idade = 24;
		int prezo;
		boolean carne = true;
		boolean paro = true;

		if (idade < 30) {
			if (carne && paro) {
				prezo = 35;
				System.out.println("O coste do cuarto é de: " + prezo + "€");
			} else if (carne || paro) {
				prezo = 40;
				System.out.println("O coste do cuarto é de: " + prezo + "€");
			} else {
				prezo = 50;
				System.out.println("O coste do cuarto é de: " + prezo + "€");
			}
		} else if (idade >= 30 && idade <= 55) {
			if (carne || paro) {
				prezo = 65;
				System.out.println("O coste do cuarto é de: " + prezo + "€");
			} else {
				prezo = 75;
				System.out.println("O coste do cuarto é de: " + prezo + "€");
			}
		} else if (idade > 55) {
			if (carne || paro) {
				prezo = 45;
				System.out.println("O coste do cuarto é de: " + prezo + "€");
			} else {
				prezo = 60;
				System.out.println("O coste do cuarto é de: " + prezo + "€");
			}
		}

	}

}
