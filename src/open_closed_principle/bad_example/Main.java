package open_closed_principle.bad_example;

public class Main {

	public static void main(String[] args) {
		Book book=new Book("Let us C","David");
		Book_DAO book_DAO=new Book_DAO(book);
		book_DAO.save("MySQL");
		book_DAO.save("MongoDB");
		book_DAO.save("File");
	}

}
