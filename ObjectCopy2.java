package array;

public class ObjectCopy2 {
	public static void main(String[] args) {
		Book[] libary = new Book[5];
		Book[] copylibary = new Book[5];
		
		libary[0] = new Book("�¹���1", "������");
		libary[1] = new Book("�¹���2", "������");
		libary[2] = new Book("�¹���3", "������");
		libary[3] = new Book("�¹���4", "������");
		libary[4] = new Book("�¹���5", "������");
		
		
		System.arraycopy(libary, 0, copylibary, 0, 5);
		
		
	/*	for (Book book : copylibary) {
			book.showBookInfo();
		}*/
		
		
		libary[0].setTilte("����");
		libary[0].setAuthor("�ڿϼ�");
		
		for (Book book : libary) {
			book.showBookInfo();
		}
		
		System.out.println("=========================");
		
			for (Book book : copylibary) {
			book.showBookInfo();
		}
		
	}
}
