package array;

public class BookArrayTest {
	public static void main(String[] args) {
			Book[] libary = new Book[5];
			
			libary[0] = new Book("태백산맥1", "조정래");
			libary[1] = new Book("태백산맥2", "조정래");
			libary[2] = new Book("태백산맥3", "조정래");
			libary[3] = new Book("태백산맥4", "조정래");
			libary[4] = new Book("태백산맥5", "조정래");
			
			
			for (int i = 0; i < libary.length; i++) {
				libary[i].showBookInfo();
			}
	}
	
}
