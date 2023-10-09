package design_pattern_assignment_10;

public class NotificationService {
    private NotificationStrategy notificationStrategy;

    public NotificationService(String method) {
        NotificationFactory factory = new NotificationFactory();
        this.notificationStrategy = factory.createNotificationStrategy(method);
    }

    public void sendNotification(String message) {
        notificationStrategy.sendNotification(message);
    }
}
