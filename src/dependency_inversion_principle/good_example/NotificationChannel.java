package dependency_inversion_principle.good_example;

//Abstraction (interface for low-level modules)
public interface NotificationChannel {
	void sendNotification(String message);
}
