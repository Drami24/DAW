
public class Main {
	public static void main(String[] args) {

		int valor = 150000;

		// Dividimos entre 3600 para calcular as horas
		int horas = valor / 3600; // 41.66 horas, pero ao ser valor enteiro = 41
		// Ao non ser exacto temos que pasar 0.66 a minutos

		// En java para calcular o resto dunha división utilizase %
		int resto = valor % 3600; // 2400 segundos que equivalen a 0.66 horas

		// Pasamos os segundos a minutos
		int minutos = resto / 60; // 40 minutos
		// Ao ser exacto non sobran segundos

		// No caso de non ser exacto
		int segundos = resto % 60; // 0 segundos
		
		// Resultado final
		System.out.println(horas + ":" + minutos + ":" + segundos);
	}
}
