package main.liskov;

interface Notification {
    public void notify(String message);
}

class Email implements Notification {
    public String emailAddress;

    Email(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void notify(String message) {
        System.out.println("Sending " + message + "to " + this.emailAddress);
    }
}

class SMS implements Notification {
    public String phoneNumber;

    SMS(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String message) {
        System.out.println("Sending " + message + "to " + this.phoneNumber);
    }
}

class Contact {
    String name, email, phoneNumber;

    Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}

class NotificationManager {
    public Notification notification;

    NotificationManager(Notification notification) {
        this.notification = notification;
    }

    public void send(String message) {
        this.notification.notify(message);
    }

    public static void main(String[] args) {
//
        Contact contact = new Contact("Paul", "paulbodean88@gmail.com", "0745570612");
        SMS sms = new SMS(contact.phoneNumber);
        Email email = new Email(contact.email);

        NotificationManager notification_manager = new NotificationManager(sms);
        notification_manager.send("Hello Paul ");
        notification_manager.notification = email;
        notification_manager.send("Hi ");

    }
}


