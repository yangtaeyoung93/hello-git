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
		
		Book book = new  Book("토지", "박경리");
		System.out.println(book.toString());
		
		
		String str = new String("토지");
		
		System.out.println(str);
	}
}
