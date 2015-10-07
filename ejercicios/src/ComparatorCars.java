import java.util.Comparator;

public class ComparatorCars implements Comparator<Car> {
	@Override
	public int compare(Car x, Car y) {
		x.setPotenciaFiscal();
		y.setPotenciaFiscal();
		if (x.getCilindrada() > y.getCilindrada())
			return 1;
		if (x.getCilindrada() < y.getCilindrada())
			return -1;
		return 0;
	}
}