import models.Director;
import models.Email;
import models.EmailBuilder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        EmailBuilder emailBuilder = new EmailBuilder();

        director.constructTestMessage(emailBuilder);
        Email testMessage = emailBuilder.getEmail();
        System.out.println("Your test message:\n" + testMessage);
    }
}