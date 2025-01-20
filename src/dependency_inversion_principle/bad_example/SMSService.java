package dependency_inversion_principle.bad_example;

//Low Level Module: SMSService
public class SMSService {

	public void sendSMS(String message) {
		System.out.println("Sending SMS"+message);
	}

}
