package activity3;

public class MainActivity3 {

	public static void main(String[] args) {
		Book b1 = new Book("978-6071135513", "The final days of our fathers", "Joel Dicker", 466);
		Book b2 = new Book("978-0451488336", "The Pillars of the Earth", "Ken Follett", 992);

		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		/*Compara el numero de paginas de los dos objetos*/

		if (b1.getNumPages() < b2.getNumPages()) {

			System.out.println(b2.getTitle() + " has more number of pages");
		} else {
			System.out.println(b1.getTitle() + " has more number of pages");
		}

	}

}
