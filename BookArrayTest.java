package array;

public class BookArrayTest {
	public static void main(String[] args) {
			Book[] libary = new Book[5];
			
			libary[0] = new Book("�¹���1", "������");
			libary[1] = new Book("�¹���2", "������");
			libary[2] = new Book("�¹���3", "������");
			libary[3] = new Book("�¹���4", "������");
			libary[4] = new Book("�¹���5", "������");
			
			
			for (int i = 0; i < libary.length; i++) {
				libary[i].showBookInfo();
			}
	}
	
}
