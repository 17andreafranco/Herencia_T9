package activity6;

import activity5.Estudent;
import activity5.Teacher;

public class MainActivity6 {

	public static void main(String[] args) {

		Place pl = new Place();
		pl.makeTheater();

		Viewers vw[] = new Viewers[40];

		Movie m = new Movie("Star Wars", 130, 16, "Gorge Lucas");

		Cinema cinema = new Cinema(15, "Star Wars");

		for (int i = 0; i < 30; i++) {

			if (i < 10) {
				vw[i] = new Viewers("Luke", 12, 5);
				pl.sitPeople(vw[i], m, cinema);

			} else if (i > 10 && i < 20) {
				vw[i] = new Viewers("Nat", 24, 70);
				pl.sitPeople(vw[i], m, cinema);
			} else if (i > 20) {
				vw[i] = new Viewers("Andrea", 23, 50);
				pl.sitPeople(vw[i], m, cinema);
			}

		}
	}

}
