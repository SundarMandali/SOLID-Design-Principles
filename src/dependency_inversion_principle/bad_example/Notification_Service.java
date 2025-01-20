package dependency_inversion_principle.bad_example;
//High level module: Notification Service
public class Notification_Service {
	EmailService emailService;
	SMSService smsService;
	
	Notification_Service(){
		this.emailService=new EmailService(); //direct dependency on EmailService
		this.smsService=new SMSService(); // direct dependency on SMSService
	} 
	
	void notifyUser(String message){
		emailService.sendEmail(message); // direct call to lowlevel modules
		smsService.sendSMS(message); // direct call to lowlevel modules
	}
}
/*
•The NotificationService class is tightly coupled to the EmailService and SMSService.
•If you want to add a new notification channel, say a Push Notification, you would have to modify the NotificationService class, which is not ideal for maintainability.
•Changing or adding any new service would require modifying the NotificationService class, violating the Dependency Inversion Principle, which states that high-level modules should not depend on low-level modules.
*/