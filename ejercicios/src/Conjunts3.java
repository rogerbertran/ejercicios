import java.util.LinkedList;
import java.util.TreeSet;

public class Conjunts3 {

	public static void main(String[] args) {
		// Declare the variables and add them into the LinkedHashSet
		ComparatorCars comparator1 = new ComparatorCars();
		ComparatorCars2 comparator2 = new ComparatorCars2();
		
		TreeSet<Car> carSet1 = new TreeSet<Car>(comparator1);
		TreeSet<Car> carSet2 = new TreeSet<Car>(comparator1);
		TreeSet<Car> carSet3 = new TreeSet<Car>(comparator2);
		TreeSet<Car> carSet4 = new TreeSet<Car>(comparator2);

		LinkedList<Car> carList = new LinkedList<Car>();
		carList.add(new Car("Alfa Romeo", "Giulia", 2900, 6));
		carList.add(new Car("Dacia", "Sandero", 1200, 4));
		carList.add(new Car("Ford", "Focus", 2000, 4));
		carList.add(new Car("Opel", "Insignia", 2200, 4));
		carList.add(new Car("Seat", "Ibiza", 1600, 4));
		carList.add(new Car("Hyundai", "Atos", 1500, 3));
		
		carSet1.addAll(carList);
		carSet2.addAll(carList);
		carSet3.addAll(carList);
		carSet4.addAll(carList);

		System.out.println("LIFO CILINDRADA");

		// shows the TreeSet sorted with the displacement by the lifo method

		while (!carSet1.isEmpty()) {
			System.out.println(carSet1.pollLast().toString());
		}

		System.out.println("------");

		System.out.println("LIFO POT. FISC");
		
		// shows the TreeSet sorted with the pot. fisc. by the lifo method
		while (!carSet3.isEmpty()) {
			System.out.println(carSet3.pollLast().toString());
		}

		System.out.println("------");

		System.out.println("FIFO CILINDRADA");

		// shows the TreeSet sorted with the displacement by the fifo method
		while (!carSet2.isEmpty()) {
			System.out.println(carSet2.pollFirst().toString());
		}

		System.out.println("------");

		System.out.println("FIFO POT. FISC.");

		// shows the TreeSet sorted with the pot. fisc. by the fifo method
		while (!carSet4.isEmpty()) {
			System.out.println(carSet4.pollFirst().toString());
		}
	}

}
