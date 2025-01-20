package single_responsibility.good_example;

public class BookPrinter {
	public void printBook(Book book){
		System.out.println("Printing");
		book.getDetails();
	}
}
