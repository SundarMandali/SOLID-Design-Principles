package single_responsibility.good_example;

public class Main {
	public static void main(String[] args) {
		Book book=new Book("Let us C","David");
		book.getDetails();
		
		BookPrinter bookPrinter=new BookPrinter();
		bookPrinter.printBook(book);
		
		BookRepository bookRepo=new BookRepository();
		bookRepo.saveToDatabase(book);
	}
}
/*
 Advantages of Single Responsibility:
 ==>So as you seperated the responsibilities, now it is easy to maintain as change in one
 responsibility will not affect the others.
 ==>Each class is modular and it can be re-used independently.  
 */
