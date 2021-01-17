package arrayTest;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(10001, "Lee");
		Student studentKim = new Student(10002, "Kim");
		Student studentCho = new Student(10003, "Cho");
		
		studentLee.addBookList("태백산맥1", "조광래");
		studentLee.addBookList("태백산맥2", "조광래");
		
		studentKim.addBookList("토지1", "박경리");
		studentKim.addBookList("토지2", "박경리");
		studentKim.addBookList("토지3", "박경리");
		
		studentCho.addBookList("해리포터1", "조앤 롤링");
		studentCho.addBookList("해리포터2", "조앤 롤링");
		studentCho.addBookList("해리포터3", "조앤 롤링");
		studentCho.addBookList("해리포터4", "조앤 롤링");
		studentCho.addBookList("해리포터5", "조앤 롤링");
		studentCho.addBookList("해리포터6", "조앤 롤링");
		studentCho.addBookList("해리포터7", "조앤 롤링");
		
		
		studentLee.showInfo();
		System.out.println("====================");
		studentKim.showInfo();
		System.out.println("====================");
		studentCho.showInfo();
	}
}
