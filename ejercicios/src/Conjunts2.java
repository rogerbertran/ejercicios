import java.util.LinkedHashSet;

public class Conjunts2 {

	public static void main(String[] args) {
		// Declare the varibales and add them into the LinkedHashSet
		LinkedHashSet<Car> carSet = new LinkedHashSet<Car>();

		carSet.add(new Car("Alfa Romeo", "Giulia", 2900, 6));
		carSet.add(new Car("Dacia", "Sandero", 1200, 4));
		carSet.add(new Car("Ford", "Focus", 2000, 4));
		carSet.add(new Car("Opel", "Insignia", 2200, 4));
		carSet.add(new Car("Seat", "Ibiza", 1600, 4));
		
		carSet.add(new Car("Hyundai", "Atos", 1500, 3));
		carSet.add(new Car("Ford", "Focus", 2000, 4));
		
		boolean resultat = 	carSet.add(new Car("Ford", "Focus", 2000, 4));
		if (resultat) {
			System.out.println("Ford Focus afegit");
		} else {
			System.out.println("Ford Focus no afegit");
		}
		
		// Shows the linkedHashSet
		for (Car x : carSet) {
			System.out.println(x.toString());
		}
		
		// ordena según cuando lo hayas añadido, es una cola fifo.
	}

}
