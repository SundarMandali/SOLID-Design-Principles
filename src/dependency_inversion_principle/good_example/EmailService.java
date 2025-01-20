package dependency_inversion_principle.good_example;

//Low-level module: EmailService implements NotificationChannel
public class EmailService implements NotificationChannel {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending Email"+message);
	}

}
