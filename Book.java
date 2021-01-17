package array;

public class Book {
	
	private String title, author;
	
	public Book() {}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTilte() {
		return title;
	}

	public void setTilte(String tilte) {
		this.title = tilte;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(title + "," + author);
	}
}
