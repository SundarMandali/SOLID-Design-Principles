package open_closed_principle.good_example;

public class MySQL_DAO implements Book_DAO{

	@Override
	public void save(Book book) {
		System.out.println("Saving to MySQL DB");
	}
	
}
