import java.util.LinkedList;
import java.util.PriorityQueue;

public class CochesList2 {

	public static void main(String[] args) {
		// We first initialize the values and the Queue.
		LinkedList<Car> carsList = new LinkedList<Car>();
		Car car1 = new Car("Alfa Romeo", "Giulia", 2900, 6);
		Car car2 = new Car("Dacia", "Sandero", 1200, 4);
		Car car3 = new Car("Ford", "Focus", 2000, 4);
		Car car4 = new Car("Opel", "Insignia", 2200, 4);
		Car car5 = new Car("Seat", "Ibiza", 1600, 4);

		// offers all the carsList into the queue
		carsList.offer(car1);
		carsList.offer(car2);
		carsList.offer(car3);
		carsList.offer(car4);
		carsList.offer(car5);

		// Clone the Linked list twice.
		LinkedList<Car> lifoAutos = (LinkedList) carsList.clone();
		LinkedList<Car> fifoAutos = (LinkedList) carsList.clone();
		
		//Creates a Comparator and a Queue and offers the cars into the queue
		ComparatorCars comparator = new ComparatorCars();
		PriorityQueue<Car> cua = new PriorityQueue<Car>(6, comparator);
		PriorityQueue<Car> cua2 = new PriorityQueue<Car>(6, comparator);
		for (Car x : carsList) {
			cua.offer(x);
			cua2.offer(x);
		}
		

		while (!cua2.isEmpty()) {
			System.out.println(cua2.poll().toString());
		}
		
		//Creates the new Object car and offers it into the queue and the lists
		Car car6 = new Car("Fiat","Panda",900,2);
		cua.offer(car6);
		lifoAutos.offerLast(car6);
		fifoAutos.offerFirst(car6);
		
		// Show the queue and the lists in order of position.
		while (!cua.isEmpty()) {
			System.out.println("------------------");
			System.out.println(cua.poll().toString());
			System.out.println(lifoAutos.pollLast().toString());
			System.out.println(fifoAutos.poll().toString());
		}
		
		// Ejemplo lifo: torre de hanoi.
		// Ejemplo fifo: cola del cine.
	}
}