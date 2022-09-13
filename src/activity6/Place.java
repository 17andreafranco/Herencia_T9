package activity6;

import java.util.Random;

public class Place {

	private Place[][] places = new Place[20][20];
	private String idPlace;
	private boolean available;

	public Place() {

	}

	public Place(String idPlace, boolean available) {
		this.idPlace = idPlace;
		this.available = available;
	}

	public String getIdPlace() {
		return idPlace;
	}

	public void setIdPlace(String idPlace) {
		this.idPlace = idPlace;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void makeTheater() {
		char letter = 'A';
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				places[i][j] = new Place("" + j + letter, true);
			}
			letter++;

		}

	}

	/*
	 * Adjudica una plaza aleatoria al usuario, compruba si la plaza esta libre o
	 * no, en caso que no este libre se propone otro sitio
	 */

	public boolean sitPeople(Viewers vw, Movie mo, Cinema cinema) {

		if (vw.getAge() >= mo.getMinAge() && vw.getMoney() >= cinema.getPriece()) {
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8; j++) {

					if (places[i][j].idPlace.equalsIgnoreCase(randomPlace()) && !places[i][j].available) {

						i = 0;
						j = 0;

					} else if (places[i][j].idPlace.equalsIgnoreCase(randomPlace()) && places[i][j].available) {
						places[i][j].available = false;
						break;
					}
				}

			}

			return true;
		}
		return false;
	}

	/* Se obtiene una plaza aleatoria de la sala */
	public String randomPlace() {
		Random random = new Random();

		String setOfCharacters = "ABCDEFGH";

		int num = (int) (Math.random() * 7 + 1);

		int randomInt = random.nextInt(setOfCharacters.length());
		char randomChar = setOfCharacters.charAt(randomInt);

		return "" + num + randomChar;

	}
}
