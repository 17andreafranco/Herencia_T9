package activity1;

public class MainActivity {

	public static void main(String[] args) {

		ElectricalAppliance elecArray[] = new ElectricalAppliance[10];

		for (int i = 0; i < 7; i++) {
			elecArray[i] = new ElectricalAppliance();
		}

		elecArray[7] = new ElectricalAppliance(100, "red", 'A', 100);
		elecArray[8] = new Washer(100, "grey", 'E', 50, 5);
		elecArray[9] = new TV(100, "orange", 'B', 50, 50, true);

		int sum = 0;

		for (int i = 0; i < elecArray.length; i++) {
			
			elecArray[i].finalPrice();
			sum += elecArray[i].getBasePrice();
		}
		System.out.println("Final price is:  " + sum);
	}

}
