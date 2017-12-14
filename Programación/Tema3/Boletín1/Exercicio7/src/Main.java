
public class Main {

	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		
		alumno1.setNome("Ana");
		alumno1.setApelidos("García Fernández");
		alumno1.setIdade(23);
		
		alumno2.setNome("David");
		alumno2.setApelidos("Varela Pérez");
		alumno2.setIdade(22);
		
		alumno1.matricular();
		alumno2.baixa();
		
		

	}

}
