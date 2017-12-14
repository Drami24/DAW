
public class Cadea {

	// constructor
	public Cadea() {
	}

	// atributos
	private String cadea1;
	private String cadea2;
	private String cadea3;

	// get and set
	public String getCadea1() {
		return cadea1;
	}

	public void setCadea1(String cadea1) {
		this.cadea1 = cadea1;
	}

	public String getCadea2() {
		return cadea2;
	}

	public void setCadea2(String cadea2) {
		this.cadea2 = cadea2;
	}

	public String getCadea3() {
		return cadea3;
	}

	public void setCadea3(String cadea3) {
		this.cadea3 = cadea3;
	}

	// método
	public void maior() {
		if (cadea1.length() > cadea2.length() && cadea1.length() > cadea3.length()) {
			System.out.println(cadea1);
		} else if (cadea2.length() > cadea1.length() && cadea2.length() > cadea3.length()) {
			System.out.println(cadea2);
		} else {
			System.out.println(cadea3);
		}
	}
}
