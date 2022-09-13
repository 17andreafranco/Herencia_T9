package activity5;

public class Teacher extends School {

	final String[] SUBJECTS = { "math", "philosophy", "physics" };
	final String SUBJECT = "math";

	private String subject;

	public Teacher() {

	}

	public Teacher(String name, int age, char sex, boolean assistance, String subject) {
		super(name, age, sex, assistance);
		this.subject = subjectCheck(subject);
	}

	/*
	 * Comprueba si la asignatura introducida en el atributo froma parte de las
	 * asignaturas que se pueden introducir
	 */

	public String subjectCheck(String subject) {

		for (int i = 0; i < SUBJECTS.length; i++) {
			if (SUBJECTS[i].equalsIgnoreCase(subject)) {
				return subject;
			}
		}

		return null;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
