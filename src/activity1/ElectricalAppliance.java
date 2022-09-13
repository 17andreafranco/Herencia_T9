package activity1;

public class ElectricalAppliance {

	final float PRICE = 100;
	final String COLOR = "white";
	final char ENERGY = 'F';
	final float WEIGHT = 5;

	protected double basePrice = PRICE;
	protected String color = COLOR;
	protected char eneCons = ENERGY;
	protected float weight = WEIGHT;

	public ElectricalAppliance() {

	}

	public ElectricalAppliance(float basePrice, float weight) {
		this.basePrice = basePrice;
		this.weight = weight;
	}

	public ElectricalAppliance(float basePrice, String color, char eneCons, float weight) {

		this.basePrice = basePrice;
		this.color = colorCheck(color);
		this.eneCons = energyCheck(eneCons);
		this.weight = weight;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getColor() {
		return color;
	}

	public char getEneCons() {
		return eneCons;
	}

	public float getWeight() {
		return weight;
	}

	/*
	 * Comprobación si la letra introducida por el usuario corresponde a un valor
	 * correcto de consumo electrico
	 */
	private char energyCheck(char letter) {

		char letterUp = Character.toUpperCase(letter);

		String energyConsume = "ABCDEF";

		if (energyConsume.indexOf(letterUp) != -1) {
			return letterUp;
		}

		return ENERGY;
	}

	/*
	 * Comprobación si el color introducida por el usuario corresponde a un valor
	 * correcto de las posibles opciones a elejir
	 */
	private String colorCheck(String color) {

		String colors[] = { "white", "black", "red", "blue", "grey" };

		for (int i = 0; i < colors.length; i++) {
			if (colors[i].equalsIgnoreCase(color)) {
				return color;
			}
		}

		return COLOR;
	}

	/* Calula el precio final segun los atributos del objeto */
	public void finalPrice() {

		switch (this.eneCons) {
		case 'A':
			this.basePrice = 100;
			break;
		case 'B':
			this.basePrice = 80;
			break;
		case 'C':
			this.basePrice = 60;
			break;
		case 'D':
			this.basePrice = 50;
			break;
		case 'E':
			this.basePrice = 30;
			break;
		case 'F':
			this.basePrice = 10;
			break;
		}

		if (this.weight > 0 && this.weight < 19) {
			this.basePrice = this.basePrice + 10;
		} else if (this.weight >= 20 && this.weight < 49) {
			this.basePrice = this.basePrice + 50;
		} else if (this.weight >= 50 && this.weight < 79) {
			this.basePrice = this.basePrice + 50;
		} else if (this.weight >= 80) {
			this.basePrice = this.basePrice + 100;
		} else {
			System.out.println("Invalid number");
		}

	}

}
