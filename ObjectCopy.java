package array;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] libary = new Book[5];
		Book[] copylibary = new Book[5];
		
		libary[0] = new Book("태백산맥1", "조정래");
		libary[1] = new Book("태백산맥2", "조정래");
		libary[2] = new Book("태백산맥3", "조정래");
		libary[3] = new Book("태백산맥4", "조정래");
		libary[4] = new Book("태백산맥5", "조정래");
		
		copylibary[0] = new Book();
		copylibary[1] = new Book(); 
		copylibary[2] = new Book();
		copylibary[3] = new Book();
		copylibary[4] = new Book();
		
		
		
		for (int i = 0; i < libary.length; i++) {
			copylibary[i].setAuthor(libary[i].getAuthor());
			copylibary[i].setTilte(libary[i].getTilte());
		}
		
	
		libary[0].setTilte("나목");
		libary[0].setAuthor("박완서");
		
		for (Book book : libary) {
			book.showBookInfo();
		}
		
		System.out.println("===================");
		
		for (Book book : copylibary) {
			book.showBookInfo();
		}
	}
}
