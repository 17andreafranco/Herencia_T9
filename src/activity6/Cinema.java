package activity6;

public class Cinema {

	private float priece;
	private String movieTitle;

	public Cinema(float priece, String movieTitle) {

		this.priece = priece;
		this.movieTitle = movieTitle;
	}

	public float getPriece() {
		return priece;
	}

	public void setPriece(float priece) {
		this.priece = priece;
	}

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

}
