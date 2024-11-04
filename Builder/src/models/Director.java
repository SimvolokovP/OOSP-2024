package models;

public class Director {
    public void constructTestMessage(EmailBuilder builder) {
        builder.reset();
        builder.setSender("test@mail.ru");
        builder.setRecipient("test2@mail.ru");
        builder.setSubject("Any Header");
        builder.setBody("Interesting message!");
    }
}
