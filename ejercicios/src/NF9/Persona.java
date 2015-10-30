package NF9;

public class Persona {
	private int edat;

	public void setEdat(int edat) throws IllegalArgumentException {
		if (edat >= 0) {
			this.edat = edat;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		Persona p = new Persona();
		try {
			p.setEdat(-1);
		} catch (IllegalArgumentException i) {
			System.out.println("error: edat negativa!");
		}
	}
}
