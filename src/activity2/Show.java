package activity2;

public class Show implements Deliverable {

	protected String title = "";
	protected int numSeason = 3;
	protected boolean delivered = false;
	protected String genre = "";
	protected String creator = "";

	public Show() {

	}

	public Show(String title, String creator) {
		this.title = title;
		this.creator = creator;

	}

	public Show(String title, int numSeason, String genre, String creator) {
		this.title = title;
		this.numSeason = numSeason;
		this.genre = genre;
		this.creator = creator;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumSeason() {
		return numSeason;
	}

	public void setNumSeason(int numSeason) {
		this.numSeason = numSeason;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Override
	public String toString() {
		return "Show [title=" + title + ", numSeason=" + numSeason + ", delivered=" + delivered + ", genre=" + genre
				+ ", creator=" + creator + "]";
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

		Show sh = (Show) o;

		int i = -1;
		if (this.numSeason == sh.getNumSeason()) {
			i = 0;
		} else if (this.numSeason > sh.getNumSeason()) {

			i = 1;
		}
		return i;
	}

}
