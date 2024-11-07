import models.Session;
import models.User;

public class Main {
    public static void main(String[] args) {
        User user1 = User.getInstance("user_Pahan222", "cool_password");
        System.out.println(user1);
        System.out.println(user1.getPassword());

        Session session1 = Session.getInstance(user1);
        System.out.println(session1);
        session1.logout();
        System.out.println(session1);
    }
}