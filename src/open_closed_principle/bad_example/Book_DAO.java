package open_closed_principle.bad_example;

public class Book_DAO {
	Book book;
	public Book_DAO(Book book){
		this.book=book;
	}
	public void save(String DAO_type) {
		if(DAO_type.equals("MySQL")) {
			System.out.println("Saving to MySQL database");
		}else if(DAO_type.equals("MongoDB")) {
			System.out.println("Saving to Mongo DB");
		}else if(DAO_type.equals("File")) {
			System.out.println("Saving to File");
		}
	}
}
/*
==>Here we can see that if you want to add new DAO_type then you need to modify the Book_DAO class.
==>Frequent changes in Book_DAO class can increase the risk of introducing new bugs and violates the
open-closed principle. 

*/