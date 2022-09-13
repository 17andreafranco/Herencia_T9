package activity2;

public class MainActivity2 {

	public static void main(String[] args) {

		Show sh[] = new Show[5];
		Videogame vg[] = new Videogame[5];

		for (int i = 0; i < 4; i++) {
			sh[i] = new Show();
		}

		for (int i = 0; i < 4; i++) {
			vg[i] = new Videogame();
			vg[i].setTitle("" + i);
		}

		sh[4] = new Show("GoT", 7, "fantasy", "G.G.Martin");
		vg[4] = new Videogame("Super Mario", 30, "fantasy", "Nintendo");

		sh[2].deliver();
		vg[1].deliver();
		vg[4].deliver();

		int cont = 0;

		for (int i = 0; i < sh.length; i++) {
			if (sh[i].isDelivered()) {
				sh[i].returned();
				cont++;
			}

		}

		System.out.println("Number of show delivered: " + cont);

		cont = 0;

		for (int i = 0; i < vg.length; i++) {

			if (vg[i].isDelivered()) {
				vg[i].returned();
				cont++;
			}

		}
		System.out.println("Number of videogames delivered: " + cont);

		int maxHours = 0;

		for (int i = 0; i < vg.length - 1; i++) {
			int time = vg[i].compareTo(vg[i + 1]);
			if (time == 1) {
				maxHours = i;
			}
		}

		int time = vg[vg.length - 1].compareTo(vg[maxHours]);
		if (time == 1) {
			maxHours = vg.length - 1;
		}

		System.out.println("Videogame with more hours is: " + vg[maxHours].toString());

		maxHours = 0;

		for (int i = 0; i < sh.length - 1; i++) {
			time = sh[i].compareTo(sh[i + 1]);
			if (time == 1) {
				maxHours = i;
			}
		}

		time = vg[vg.length - 1].compareTo(vg[maxHours]);
		if (time == 1) {
			maxHours = sh.length - 1;
		}

		System.out.println("The show with more seasons is: " + sh[maxHours].toString());

	}
}
