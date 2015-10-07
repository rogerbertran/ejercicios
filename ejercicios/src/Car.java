public class Car {

	String marca;
	String model;
	int cilindrada;
	int cilindres;
	double potenciaFiscal;
	
	public Car(String marca, String model, int cilindrada, int cilindres) {
		this.marca = marca;
		this.model = model;
		this.cilindrada = cilindrada;
		this.cilindres = cilindres;
	}
	
	public Car() {
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getCilindres() {
		return cilindres;
	}
	public void setCilindres(int cilindres) {
		this.cilindres = cilindres;
	}
	public double getPotenciaFiscal() {
		return potenciaFiscal;
	}
	public void setPotenciaFiscal() {
		this.potenciaFiscal = 0.08 * this.getCilindres() * Math.pow(this.getCilindrada()/this.getCilindres(), 0.6);;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cilindrada;
		result = prime * result + cilindres;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (cilindrada != other.cilindrada)
			return false;
		if (cilindres != other.cilindres)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [marca=" + marca + ", model=" + model + ", cilindrada=" + cilindrada + ", cilindres=" + cilindres
				+ ", potenciaFiscal=" + potenciaFiscal + "]";
	}
}
