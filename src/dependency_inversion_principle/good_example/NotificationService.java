package dependency_inversion_principle.good_example;

public class NotificationService {
	NotificationChannel notificationChannel;
	
	//Dependency Injection(Constructor-based)
	NotificationService(NotificationChannel notificationChannel){
		this.notificationChannel=notificationChannel;
	}
	void notifyUser(String message){
		notificationChannel.sendNotification(message); //Depends on abstraction(Interface) not on low level modules.
	}
}
