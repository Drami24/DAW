
public class Main {
	public static void main(String[] args) {

		// ¿Por qué da true?
		System.out.println(3 + 5 < 5 * 2 || 3 > 8 && 7 > 6 - 2);

		// Vamos a empezar a simplificar
		// 8<10 || 3>8 && 7>4

		// Cambiamos os intervalos por true ou false
		// true || false && true

		// Cambiamos true por 1 e false por 0, tamén || por OR e && por AND
		// 1 OR 0 AND 1

		// mirando a táboa de OR e AND
		// No caso de OR 1 + 0 = 1
		// No caso de AND 1 + 1 = 1

		// Resultado = 1
		// Recordando o código anterior: 1 equivale a true, e 0 a false
		// Resultado final = true

	}
}
