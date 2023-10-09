package design_pattern_assignment_10;

public class NotificationFactory {
    public NotificationStrategy createNotificationStrategy(String method) {
        switch (method) {
            case "email":
                return new EmailNotificationStrategy();
            case "sms":
                return new SMSNotificationStrategy();
            case "push":
                return new PushNotificationStrategy();
            default:
                throw new IllegalArgumentException("Invalid notification method: " + method);
        }
    }
}
