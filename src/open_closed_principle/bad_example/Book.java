package open_closed_principle.bad_example;

public class Book {
	String bookName;
	String author;

	public Book(String bookName,String author){
		this.bookName=bookName;
		this.author=author;
	}
	public void getDetails(){
		System.out.println("Book Name: "+bookName+" author: "+author);
	}
}
