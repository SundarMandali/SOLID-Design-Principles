package dependency_inversion_principle.good_example;

//Low-level module: SMSService implements NotificationChannel
public class SMSService implements NotificationChannel {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending SMS"+message);
	}

}
