package array;

public class StudentTest {
	public static void main(String[] args) {
		
		Student student = new Student(10001, "Lee");
		Student student2 = new Student(10002, "Kim");
		
		student.addSubject("����", 100);
		student.addSubject("����", 90);
		
		student2.addSubject("����", 20);
		student2.addSubject("����", 100);
		student2.addSubject("�̼�", 100);
		
		
		student.showStudentInfo();
		System.out.println("====================");
		student2.showStudentInfo();
	}
}
