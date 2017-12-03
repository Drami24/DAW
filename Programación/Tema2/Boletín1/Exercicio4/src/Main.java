
public class Main {

	public static void main(String[] args) {

		int nota = 7;

		switch (nota) {
		case 10:
			System.out.println("Matrícula de Honor");
			break;
		case 9:
		case 8:
			System.out.println("Sobresaliente");
			break;
		case 7:
			System.out.println("Notable");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 5:
			System.out.println("Aprobado");
			break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Suspenso");
			break;
		default:
			System.out.println("Nota errónea");
			break;
		}

	}

}
