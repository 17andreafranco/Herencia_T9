package activity2;

public class Videogame {

	protected String title = "";
	protected int hours = 10;
	protected boolean delivered = false;
	protected String genre = "";
	protected String company = "";

	public Videogame() {

	}

	public Videogame(String title, String company) {
		this.title = title;
		this.company = company;

	}

	public Videogame(String title, int hours, String genre, String company) {
		this.title = title;
		this.hours = hours;
		this.genre = genre;
		this.company = company;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Videogame [title=" + title + ", hours=" + hours + ", delivered=" + delivered + ", genre=" + genre
				+ ", company=" + company + "]";
	}

	/* Metodos que implementados de la interfac */
	
	
	/* Cambia el atributoa delivered a true */

	public void deliver() {
		this.delivered = true;
	}
	
	/* Cambia el atributoa delivered a false */

	public void returned() {
		this.delivered = false;
	}
	
	/* Retrona si el valor delivered*/

	public boolean isDelivered() {
		return this.delivered;
	}
	
	/* Compara el atributo horas de dos ojetos Videogame*/

	public int compareTo(Object o) {

		Videogame vg = (Videogame) o;

		int i = -1;
		if (this.hours == vg.getHours()) {
			i = 0;
		} else if (this.hours > vg.getHours()) {

			i = 1;
		}
		return i;
	}

}
