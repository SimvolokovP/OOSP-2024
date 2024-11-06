package models;

public class Snapshot {
    private VirtualMachine virtualMachine;
    private String state;
    private double cpuUsage;
    private double memoryUsage;

    public Snapshot(VirtualMachine virtualMachine, String state, double cpuUsage, double memoryUsage) {
        this.virtualMachine = virtualMachine;
        this.state = state;
        this.cpuUsage = cpuUsage;
        this.memoryUsage = memoryUsage;
    }

    public VirtualMachine getVirtualMachine() {
        return virtualMachine;
    }

    public void restoreVirtualMachine() {
        this.virtualMachine.setState(state);
        this.virtualMachine.setCpuUsage(cpuUsage);
        this.virtualMachine.setMemoryUsage(memoryUsage);
    }
}
