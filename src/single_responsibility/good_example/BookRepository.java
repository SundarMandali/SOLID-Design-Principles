package single_responsibility.good_example;

public class BookRepository {
	void saveToDatabase(Book book) {
		System.out.println("Saving book to the database");
		book.getDetails();
	}
}
