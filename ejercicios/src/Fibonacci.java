import java.util.ArrayList;
import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		// We first initialize the values and the array.
		ArrayList<Integer> fibonacci = new ArrayList<Integer>(24);
		int i = 2;
		int value = 0;
		// We set the value 0 in the position 0 and the same with the position 1 with the value 1 and we print it
		fibonacci.add(0,0);
		fibonacci.add(1,1);
		System.out.println("0\n1");
		// We set all the values of the array by the fibonacci's method
		for (i = 2; i < 25; i++) {
			value = fibonacci.get(i-2) + fibonacci.get(i-1);
			fibonacci.add(i,value);
			System.out.println(value);
		}
		// We show the array with the "for-each" method
		for (int j : fibonacci) {
			System.out.println(j);
		}
		// We show the array with the Iterator method
		Iterator itr = fibonacci.iterator();
		while(itr.hasNext()) {
			Object element = itr.next();
			System.out.println(element);
		}
		// In which position is the number 2584
		System.out.println("El número 2584 està a la posició: " + fibonacci.indexOf(2584));
		// If the number 4311 is inside the array
		System.out.println("El número 4311 està a l'array? " + fibonacci.contains(4311));
	}
}