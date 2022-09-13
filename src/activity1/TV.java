package activity1;

public class TV extends ElectricalAppliance {

	final float RESOLUTION_CONST = 20;
	final boolean TDT_CONST = false;

	private float resolution = RESOLUTION_CONST;
	private boolean tdt = TDT_CONST;

	public TV() {

	}

	public TV(float basePrice, float weight) {
		super(basePrice, weight);
	}

	public TV(float basePrice, String color, char eneCons, float weight, float resolution, boolean tdt) {
		super(basePrice, color, eneCons, weight);
		this.resolution = resolution;
		this.tdt = tdt;
	}

	public float getResolution() {
		return resolution;
	}

	public boolean isTdt() {
		return tdt;
	}

	@Override
	/*
	 * Sobreescribe el metodo de la clase padre ElectricalAppliance. Calcula el
	 * precio final de la TV segun los atributos introducidos al crear el objeto
	 */
	public void finalPrice() {

		super.finalPrice();

		if (this.resolution > 40) {
			super.basePrice = super.basePrice + (super.basePrice * 0.30);
		} else if (this.resolution < 0) {
			System.out.println("Invalid number");
		}

		if (this.tdt) {
			super.basePrice = super.basePrice + 50;
		}
	}

}
