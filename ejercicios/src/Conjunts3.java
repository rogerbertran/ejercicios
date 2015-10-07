import java.util.TreeSet;

public class Conjunts3 {

	public static void main(String[] args) {
		// Declare the variables and add them into the LinkedHashSet
		ComparatorCars comparator1 = new ComparatorCars();
		ComparatorCars2 comparator2 = new ComparatorCars2();
		
		TreeSet<Car> carSet1 = new TreeSet<Car>(comparator1);

		carSet1.add(new Car("Alfa Romeo", "Giulia", 2900, 6));
		carSet1.add(new Car("Dacia", "Sandero", 1200, 4));
		carSet1.add(new Car("Ford", "Focus", 2000, 4));
		carSet1.add(new Car("Opel", "Insignia", 2200, 4));
		carSet1.add(new Car("Seat", "Ibiza", 1600, 4));
		carSet1.add(new Car("Hyundai", "Atos", 1500, 3));
		
		TreeSet<Car> carSet2 = new TreeSet<Car>(comparator1);

		carSet2.add(new Car("Alfa Romeo", "Giulia", 2900, 6));
		carSet2.add(new Car("Dacia", "Sandero", 1200, 4));
		carSet2.add(new Car("Ford", "Focus", 2000, 4));
		carSet2.add(new Car("Opel", "Insignia", 2200, 4));
		carSet2.add(new Car("Seat", "Ibiza", 1600, 4));
		carSet2.add(new Car("Hyundai", "Atos", 1500, 3));

		TreeSet<Car> carSet3 = new TreeSet<Car>(comparator2);

		carSet3.add(new Car("Alfa Romeo", "Giulia", 2900, 6));
		carSet3.add(new Car("Dacia", "Sandero", 1200, 4));
		carSet3.add(new Car("Ford", "Focus", 2000, 4));
		carSet3.add(new Car("Opel", "Insignia", 2200, 4));
		carSet3.add(new Car("Seat", "Ibiza", 1600, 4));
		carSet3.add(new Car("Hyundai", "Atos", 1500, 3));

		TreeSet<Car> carSet4 = new TreeSet<Car>(comparator2);

		carSet4.add(new Car("Alfa Romeo", "Giulia", 2900, 6));
		carSet4.add(new Car("Dacia", "Sandero", 1200, 4));
		carSet4.add(new Car("Ford", "Focus", 2000, 4));
		carSet4.add(new Car("Opel", "Insignia", 2200, 4));
		carSet4.add(new Car("Seat", "Ibiza", 1600, 4));
		carSet4.add(new Car("Hyundai", "Atos", 1500, 3));

		System.out.println("LIFO CILINDRADA");

		// shows the TreeSet sorted by the cilindrada by the lifo method

		for (int i = 0; i <= carSet1.size(); i++) {
			System.out.println(carSet1.last());
			carSet1.remove(carSet1.last());
			i = 0;
		}

		System.out.println("------");

		System.out.println("LIFO POT. FISC");
		
		// shows the TreeSet sorted by the F.P. by the lifo method
		for (int i = 0; i <= carSet3.size(); i++) {
			System.out.println(carSet3.last());
			carSet3.remove(carSet3.last());
			i = 0;
		}

		System.out.println("------");

		System.out.println("FIFO CILINDRADA");

		// shows the TreeSet sorted by the cilindrada by the fifo method
		for (int i = 0; i <= carSet2.size(); i++) {
			System.out.println(carSet2.first());
			carSet2.remove(carSet2.first());
			i = 0;
		}

		System.out.println("------");

		System.out.println("FIFO POT. FISC.");

		// shows the TreeSet sorted by the F.P. by the fifo method
		for (int i = 0; i <= carSet4.size(); i++) {
			System.out.println(carSet4.first());
			carSet4.remove(carSet4.first());
			i = 0;
		}
	}

}
