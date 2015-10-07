import java.util.HashSet;

public class Conjunts1 {
	public static void main(String[] args) {
		// Declare the varibales and add them into the HashSet
		HashSet<Car> carSet = new HashSet<Car>();

		carSet.add(new Car("Alfa Romeo", "Giulia", 2900, 6));
		Car dacia = new Car("Dacia", "Sandero", 1200, 4);
		carSet.add(dacia);
		carSet.add(new Car("Ford", "Focus", 2000, 4));
		carSet.add(new Car("Opel", "Insignia", 2200, 4));
		Car ibiza = new Car("Seat", "Ibiza", 1600, 4);
		carSet.add(ibiza);

		// returns the F.P. of the dacia
		dacia.setPotenciaFiscal();
		System.out.println(dacia.getPotenciaFiscal());

		carSet.add(new Car("Hyundai", "Atos", 1500, 3));
		
		boolean resultat = 	carSet.add(new Car("Ford", "Focus", 2000, 4));
		if (resultat) {
			System.out.println("Ford Focus afegit");
		} else {
			System.out.println("Ford Focus no afegit");
		}

		// there are no positions in the HashSet.

		// Changes the ibiza for the mii
		Car mii = new Car("Seat", "Mii", 1000, 3);
		if (carSet.contains(ibiza)) {
			carSet.remove(ibiza);
			carSet.add(mii);
		}
		
		// Shows the HashSet
		for (Car x : carSet) {
			x.setPotenciaFiscal();
			System.out.println(x.toString());
		}

		// they aren't sorted
	}
}
