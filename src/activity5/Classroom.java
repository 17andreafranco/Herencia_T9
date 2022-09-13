package activity5;

public class Classroom {

	final String[] SUBJECTS = { "math", "philosophy", "physics" };

	private Estudent estudents[];
	private Teacher teacher;
	private int idClassRoom;
	private int numMaxEst;
	private String typeSubject;

	public Classroom() {
		super();
	}

	public Classroom(int idClassRoom, Estudent[] estudents, Teacher teacher, int numMaxEst, String typeSubject) {

		this.idClassRoom = idClassRoom;
		this.estudents = estudents;
		this.teacher = teacher;
		this.numMaxEst = numMaxEst;
		this.typeSubject = subjectCheck(typeSubject);
	}

	public String subjectCheck(String subject) {

		for (int i = 0; i < SUBJECTS.length; i++) {
			if (SUBJECTS[i].equalsIgnoreCase(subject)) {
				return subject;
			}
		}

		return null;
	}

	/* Comprueba si se cumplen las condiciones para realizar clases */

	public boolean classAvailable() {

		if (teacher.isAssistance() && teacher.getSubject().equalsIgnoreCase(this.typeSubject)
				&& isNumEstudentsAvailable() && this.numMaxEst >= this.estudents.length) {

			System.out.println("Available for class");
			return true;
		}
		System.out.println("Not available for class");

		return false;

	}

	/*
	 * clases
	 */

	public boolean isNumEstudentsAvailable() {

		int esAssistance = 0;
		int numEstudents = 0;

		for (int i = 0; i < this.estudents.length; i++) {

			if (estudents[i] != null) {

				numEstudents++;

			}

		}

		float ass50per100 = (float) (numEstudents * 0.5);

		for (int i = 0; i < this.estudents.length; i++) {

			if (estudents[i] != null) {
				if (estudents[i].isAssistance()) {
					esAssistance++;
				}
			}

		}

		if (esAssistance >= ass50per100) {
			return true;
		}
		return false;
	}

	/* Cuenta el numero de mujeres y hombres que han aprobado */

	public void passTheSubject() {

		int countM = 0;
		int countF = 0;

		for (int i = 0; i < this.estudents.length; i++) {
			if (estudents[i] != null) {
				if (estudents[i].sex == 'F' && estudents[i].getMark() >= 5) {
					countF++;
				} else if (estudents[i].sex == 'M' && estudents[i].getMark() >= 5) {
					countM++;
				}
			}
		}

		System.out.println("The number of women who pass the subject is: " + countF);
		System.out.println("The number of men who pass the subject is: " + countM);

	}

}
