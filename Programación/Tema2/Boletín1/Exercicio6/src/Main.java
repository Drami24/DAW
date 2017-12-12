
public class Main {

	public static void main(String[] args) {

		int mes = 1;
		boolean bisiesto = false;

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes " + mes + " tiene 31 días");
			break;
		case 2:
			if (bisiesto) {
				System.out.println("El mes " + mes + " tiene 29 días");
			} else {
				System.out.println("Este mes " + mes + " tiene 28 días");
			}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Este mes " + mes + " tine 30 días");
			break;
		default:
			System.out.println("Este mes " + mes + " no existe");
			break;
		}
	}
}
