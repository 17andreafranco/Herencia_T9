package activity5;

public class Estudent extends School {

	private int id;
	private float mark;

	public Estudent() {

	}

	public Estudent(String name, int age, char sex, boolean assistance, float mark ) {
		super(name, age, sex, assistance);
		this.mark = mark;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getMark() {
		return mark;
	}

	public void setMark(float mark) {
		this.mark = mark;
	}


}