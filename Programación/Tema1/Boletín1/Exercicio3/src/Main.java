
public class Main {
	public static void main(String[] args) {

		// Dividimos entre 3600 para calcular as horas
		int horas = 150000 / 3600; // 41.66 horas
		// Ao non ser exacto temos que pasar o 0,66 a minutos

		// En java para calcular o resto dunha división utilizase %
		int minutos = 150000 % 3600; // 2400 segundos

		// Pasamos os segundos a minutos
		minutos = minutos / 60; // 40 minutos
		// Ao ser exacto non sobran segundos

		// No caso de non ser exacto
		int segundos = 2400 % 60; // 0 segundos
		segundos = segundos / 60; // 0 segundos

		// Resultado final
		System.out.println(horas + ":" + minutos + ":" + segundos);

	}
}
