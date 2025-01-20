package dependency_inversion_principle.good_example;

public class Main {

	public static void main(String[] args) {
		// Creating the specific notification channel
		NotificationChannel email=new EmailService();
		
		// Injecting the dependency into NotificationService
		NotificationService notificationService=new NotificationService(email);
		
		// Calling the notifyUser method which uses the provided service
		notificationService.notifyUser(" Hi Sundar");
		
	}

}
/*
•The NotificationService class no longer directly depends on EmailService or SMSService.
•Instead, it depends on the NotificationChannel interface, which allows it to use any implementation that adheres to this interface.
•The EmailService and SMSService classes both implement the NotificationChannel interface, so the NotificationService class can work with any service that implements the interface.
*/