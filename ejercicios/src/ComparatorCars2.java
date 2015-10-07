import java.util.Comparator;

public class ComparatorCars2 implements Comparator<Car> {
	@Override
	public int compare(Car x, Car y) {
		x.setPotenciaFiscal();
		y.setPotenciaFiscal();
		if (x.getPotenciaFiscal() > y.getPotenciaFiscal())
			return 1;
		if (x.getPotenciaFiscal() < y.getPotenciaFiscal())
			return -1;
		return 0;
	}
}