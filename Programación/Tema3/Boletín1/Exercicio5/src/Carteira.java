
public class Carteira {

	// Constructor
	public Carteira() {
	}

	// Atributos
	private double cartos;
	private boolean tarxeta;

	// Get and Set
	public double getCartos() {
		return cartos;
	}

	public void setCartos(double cartos) {
		this.cartos = cartos;
	}

	public boolean isTarxeta() {
		return tarxeta;
	}

	public void setTarxeta(boolean tarxeta) {
		this.tarxeta = tarxeta;
	}

	// Método
	public void disponible() {
		if (cartos > 100) {
			System.out.println("Si teño efectivo");
		} else if (tarxeta) {
			System.out.println("Necesitas ir ao caixeiro");
		} else {
			System.out.println("Necesitas ir á sucursal");
		}
	}

}
