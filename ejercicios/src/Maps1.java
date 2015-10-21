import java.util.Map;
import java.util.TreeMap;

public class Maps1 {

	public static void main(String[] args) {
		// Add maps to the treeMap
		Map<String, Car> map = new TreeMap<String, Car>();
		map.put(new String("1234 AAA"), new Car("Alfa Romeo", "Giulia", 2900, 6));
		map.put(new String("2321 BBB"), new Car("Seat", "Ibiza", 1600, 3));
		map.put(new String("8232 FFF"), new Car("Ford", "Focus", 2000, 4));
		map.put(new String("3311 FFF"), new Car("Ford", "Mondeo", 2200, 4));
		map.put(new String("9381 LLL"), new Car("Seat", "Leon", 1600, 4));
		map.put(new String("B 9011 XC"), new Car("Hyundai", "Atos", 1500, 3));
		map.put(new String("9234 BHG"), new Car("Hyundai", "Santa Fe", 3000, 6));
		map.put(new String("9216 CKK"), new Car("Hyundai", "Accent", 1500, 4));
		
		Car resultat = map.put(new String("9216 CKK"), new Car("Hyundai", "Accent", 1500, 4));
		if (resultat == null) {
			System.out.println("Hyundai no afegit");
		} else {
			System.out.println("Hyundai afegit");
		}
		
		
		
		// Show them
		for(Map.Entry<String, Car> entry : map.entrySet()) {
			  System.out.println(entry.getKey() + " => " + entry.getValue());
		}

	}

}