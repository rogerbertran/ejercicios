import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import org.omg.Messaging.SyncScopeHelper;

public class Maps2 {
	
	public static void eliminar(Map<String, Car> mapa) {
		ArrayList<String> carsToRemove = new ArrayList<String>();
		for (Map.Entry<String, Car> entry : mapa.entrySet()) {
			if (entry.getValue().getCilindrada() > 2500) {
				carsToRemove.add(entry.getKey());
			}
		}
		for (String key : carsToRemove) {
			System.out.println(mapa.remove(key));
		}
	}
	
	public static void mateixNombreCilindres(int cilindres, Map<String, Car> mapa) {
		ArrayList<Car> cars = new ArrayList<Car>();
		for (Map.Entry<String, Car> entry : mapa.entrySet()) {
			if (entry.getValue().getCilindres() == cilindres) {
				cars.add(entry.getValue());
			}
		}
		System.out.println(cars);
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Car> map = new TreeMap<String, Car>();
		map.put(new String("1234 AAA"), new Car("Alfa Romeo", "Giulia", 2900, 6));
		map.put(new String("2321 BBB"), new Car("Seat", "Ibiza", 1600, 3));
		map.put(new String("8232 FFF"), new Car("Ford", "Focus", 2000, 4));
		map.put(new String("3311 FFF"), new Car("Ford", "Mondeo", 2200, 4));
		map.put(new String("9381 LLL"), new Car("Seat", "Leon", 1600, 4));
		map.put(new String("B 9011 XC"), new Car("Hyundai", "Atos", 1500, 3));
		map.put(new String("9234 BHG"), new Car("Hyundai", "Santa Fe", 3000, 6));
		map.put(new String("9216 CKK"), new Car("Hyundai", "Accent", 1500, 4));
		
		mateixNombreCilindres(3, map);
		eliminar(map);

	}

}