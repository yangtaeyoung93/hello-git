package object;

class Student{
	int studentNumber;
	String studentName;
	
	public Student (int studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student) {
			Student std = (Student) obj;
			if(this.studentNumber == std.studentNumber) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNumber;
	}
	
	
}


public class EqualsTest {
	public static void main(String[] args) {
		
		Student Lee = new Student(100, "이순신");
		Student Lee2 = Lee;
		Student shin = new Student(100, "이순신");
		
		System.out.println(Lee == shin);
		System.out.println(Lee.equals(shin));
		
		System.out.println(Lee.hashCode());
		System.out.println(shin.hashCode());
	}
}
