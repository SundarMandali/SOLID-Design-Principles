package dependency_inversion_principle.bad_example;

//Low Level Module: EmailService
public class EmailService {

	public void sendEmail(String message) {
		System.out.println("Sending Email"+message);
	}

}
