package object;

class Book{
	
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return author+"," + title;
	}
}



public class ToString {
	

	public static void main(String[] args) {
		
		Book book = new  Book("����", "�ڰ渮");
		System.out.println(book.toString());
		
		
		String str = new String("����");
		
		System.out.println(str);
	}
}
