
public class Main {

	public static void main(String[] args) {

		int humedade = 12;
		int temperatura = 28;

		if (temperatura > 24 && humedade > 50) {
			System.out.println("Alerta vermella");
		} else if (temperatura > 24 || humedade > 50) {
			System.out.println("Alerta amarela");
		} else {
			System.out.println("Alerta verde");
		}

	}

}
