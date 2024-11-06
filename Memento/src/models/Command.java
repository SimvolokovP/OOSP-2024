package models;

public class Command {
    private Snapshot backup;
    public void makeBackup(VirtualMachine vm) {
        backup = vm.createSnapshot();
    }
    public void undo() {
        if (backup != null) {
            backup.restoreVirtualMachine();
        }
    }
}
