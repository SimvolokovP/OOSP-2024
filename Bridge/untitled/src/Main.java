import models.PLC;
import models.PLCType;
import models.Type;

public class Main {
    public static void main(String[] args) {
        Type type = new PLCType();
        PLC system = new PLC(type);
        System.out.println(system.work());
    }
}
