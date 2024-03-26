package comparableandcomparator;

public class Student {

	int id;
	String nameString;

	Student() {

	}

	public Student(int id, String nameString) {
		super();
		this.id = id;
		this.nameString = nameString;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	@Override
	public boolean equals(Object obj) {

		Student otherStudent = (Student) obj;

		return this.nameString.equals(otherStudent.nameString) && this.id == otherStudent.id;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
	}

}
