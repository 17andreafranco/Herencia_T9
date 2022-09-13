package activity5;

public class School {
	
	protected String name;
	protected int age;
	protected char sex;
	protected boolean assistance = false;
	
	public School(){
		
	}

	public School(String name, int age, char sex, boolean assistance) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.assistance = assistance;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public boolean isAssistance() {
		return assistance;
	}

	public void setAssistance(boolean assistance) {
		this.assistance = assistance;
	}

}
