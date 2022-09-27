package p0926;

public class Book {
	String title;
	String author;
	
	void show() {System.out.println(title + " " + author);}
	
	public Book() {
//		this.title = "빈 책";
//		this.author = "빈 작가";
		this("빈 책", "빈 작가");
		System.out.println();
	}
	
	public Book(String title) {
//		this.title = title;
//		this.author = "작자미상";
		this(title, "작자미상");
		

	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리");
		Book loveStory = new Book("춘향전");
		Book emptyBook = new Book();
		loveStory.show();
		emptyBook.show();
	}

}
