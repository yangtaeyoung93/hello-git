package arrayTest;

import java.util.ArrayList;

public class Student {

	private int studentId;
	private String studentNm;
	ArrayList<Book> list;
	
	public Student(int studentId, String studentNm) {
		super();
		this.studentId = studentId;
		this.studentNm = studentNm;
		list = new ArrayList<>();
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentNm() {
		return studentNm;
	}

	public void setStudentNm(String studentNm) {
		this.studentNm = studentNm;
	}
	
	public void addBookList(String name, String author) {
		
		Book book = new Book();
		book.setAuthor(author);
		book.setName(name);
		list.add(book);
	}
	public void showInfo() {
		System.out.print(studentNm + "학생이 읽은 책은 " );
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getName() + " ,");
		}
		System.out.println("입니다.");
		
	}
}
