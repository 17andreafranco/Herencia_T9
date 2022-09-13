package activity3;

public class Book {
	
	private String isbn;
	private String title;
	private String autor;
	private int numPages;
	
	public Book () {
		
	}

	public Book(String isbn, String title, String autor, int numPages) {
		this.isbn = isbn;
		this.title = title;
		this.autor = autor;
		this.numPages = numPages;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPages() {
		return numPages;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	@Override
	public String toString() {
		return ("The book with ISBN "+ this.isbn+" created by " + this.autor +" has "+ this.numPages) ;
	}
	

}
