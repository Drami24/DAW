
public class Main {

	public static void main(String[] args) {

		// Estado do ascendor: a=abrir b=baixar p=pechar s=subir e=erro
		char estado = 's';
		
		switch (estado) {
		case 'a':
			System.out.println("O ascensor estase abrindo");
			break;
		case 'b':
			System.out.println("O ascensor está baixando");
			break;
		case 'p':
			System.out.println("O ascensor estase pechando");
			break;
		case 's':
			System.out.println("O ascensor está subindo");
			break;
		case 'e':
			System.out.println("O ascensor está averiado");
			break;
		default:
			System.out.println("Código erróneo");
			break;
		
		}

	}

}
