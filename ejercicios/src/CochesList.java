import java.util.LinkedList;

public class CochesList {

	public static void main(String[] args) {
		// We first initialize the values and the Queue.
		LinkedList<Car> carsList = new LinkedList<Car>();
		Car car1 = new Car("Alfa Romeo","Giulia",2900,6);
		Car car2 = new Car("Dacia","Sandero",1200,4);
		Car car3 = new Car("Ford","Focus",2000,4);
		Car car4 = new Car("Opel","Insignia",2200,4);
		Car car5 = new Car("Seat","Ibiza",1600,4);
		
		// offers all the carsList into the queue
		carsList.offer(car1);
		carsList.offer(car2);
		carsList.offer(car3);
		carsList.offer(car4);
		carsList.offer(car5);
		
		// creates two new carsList and offer them
		Car car6 = new Car("Hyundai","Atos",1500,3);
		Car car7 = new Car("Ford","Focus",2000,4);
		
		carsList.offer(car6);
		carsList.offer(car7);
		
		// Si es poden afegir duplicats.
		
		// creates a new car and offers it into the position 1
		Car car8 = new Car("Audi","A8",4600,8);
		
		// Doesn't lets us to add the car into the position 1 'carsList.offer(1,car8);'
		
		// We create a new car
		Car car9 = new Car("Seat","Mii",1000,3);
		// Look for the Seat Ibiza and change it for the Seat Mii
		for (Car c : carsList) {
			if (c == car5) {
				carsList.set(carsList.indexOf(c),car9);
			}
		}
		
		// remove the first car of the queue.
		carsList.pollFirst();
		
		// Shows the position of the Hyundai
		for (Car c : carsList) {
			if (c == car6) {
				System.out.println("El Hyundai est� a la posici�: " + carsList.indexOf(c));
			}
		}
		
		// shows all the carsList
		System.out.println("---------------------------");
		for (Car c : carsList) {
			System.out.println(c.toString());
		}		
	}
}