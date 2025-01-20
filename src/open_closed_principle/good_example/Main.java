package open_closed_principle.good_example;

public class Main {

	public static void main(String[] args) {
		Book book=new Book("Let us C","David");
		Book_DAO fileDAO=new FileDAO();
		fileDAO.save(book);
		
		Book_DAO mysqlDAO=new MySQL_DAO();
		mysqlDAO.save(book);
		
		Book_DAO mongoDAO=new MongoDB_DAO();
		mongoDAO.save(book);
	}

}
/*
 ==>Adding new DAO_type doesn't require changing the existing code.
 ==>hence it is open for extension and closed for modification.
 */