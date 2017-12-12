
public class Main {

	public static void main(String[] args) {

		// Variables de tipo enteiro que gardan números para comparar cal é o máis grande
		int num1 = 6;
		int num2 = 8;
		int num3 = 5;

		// Comparamos cal é o número máis grande
		if (num1 > num2 && num1 > num3) {
			System.out.println("El número " + num1 + " es más grande que " + num2 + " y " + num3);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("El número " + num2 + " es más grande que " + num1 + " y " + num3);
		} else if (num3 > num1 && num3 > num2) {
			System.out.println("El número " + num3 + " es más grande que " + num1 + " y " + num2);
		}
	}

}
