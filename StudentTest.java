package arrayTest;

public class StudentTest {
	public static void main(String[] args) {
		
		Student studentLee = new Student(10001, "Lee");
		Student studentKim = new Student(10002, "Kim");
		Student studentCho = new Student(10003, "Cho");
		
		studentLee.addBookList("�¹���1", "������");
		studentLee.addBookList("�¹���2", "������");
		
		studentKim.addBookList("����1", "�ڰ渮");
		studentKim.addBookList("����2", "�ڰ渮");
		studentKim.addBookList("����3", "�ڰ渮");
		
		studentCho.addBookList("�ظ�����1", "���� �Ѹ�");
		studentCho.addBookList("�ظ�����2", "���� �Ѹ�");
		studentCho.addBookList("�ظ�����3", "���� �Ѹ�");
		studentCho.addBookList("�ظ�����4", "���� �Ѹ�");
		studentCho.addBookList("�ظ�����5", "���� �Ѹ�");
		studentCho.addBookList("�ظ�����6", "���� �Ѹ�");
		studentCho.addBookList("�ظ�����7", "���� �Ѹ�");
		
		
		studentLee.showInfo();
		System.out.println("====================");
		studentKim.showInfo();
		System.out.println("====================");
		studentCho.showInfo();
	}
}
