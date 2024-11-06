import models.Command;
import models.VirtualMachine;

public class Main {
    public static void main(String[] args) {
        VirtualMachine vm = new VirtualMachine();
        Command command = new Command();
        vm.setState("enabled");
        vm.setCpuUsage(15);
        vm.setMemoryUsage(25);

        command.makeBackup(vm);

        System.out.println(vm);

        vm.setCpuUsage(20);

        System.out.println(vm);

        command.undo();

        System.out.println(vm);
    }
}