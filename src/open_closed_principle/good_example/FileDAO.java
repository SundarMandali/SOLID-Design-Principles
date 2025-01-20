package open_closed_principle.good_example;

public class FileDAO implements Book_DAO{

	@Override
	public void save(Book book) {
		System.out.println("Saving to File");
	}

}
