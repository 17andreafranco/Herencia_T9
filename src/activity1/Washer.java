package activity1;

public class Washer extends ElectricalAppliance {
	
	final float LOAD_CONST = 5;
	
	private float load = LOAD_CONST;
	
	public Washer() {
		
	}
	
	public Washer(float basePrice, float weight) {
		super(basePrice,weight);
	}
	

	public Washer(float basePrice, String color, char eneCons, float weight,float load) {
		super(basePrice,  color,  eneCons,  weight);
		this.load = load;
	}

	public float getLoad() {
		return load;
	}
	
	@Override
	/*
	 * Sobreescribe el metodo de la clase padre ElectricalAppliance. Calcula el
	 * precio final de la Washer segun los atributos introducidos al crear el objeto
	 */
	public void finalPrice() {

		super.finalPrice();

		if (this.load > 30){
			super.basePrice = super.getBasePrice() + 50;
		} else if(this.load < 0) {
			System.out.println("Invalid number");
		}
	}

}
