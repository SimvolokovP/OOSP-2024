package models;

public class VirtualMachine {
    private String state;
    private double cpuUsage;
    private double memoryUsage;

    public void setState(String state) {
        this.state = state;
    }

    public void setCpuUsage(double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public void setMemoryUsage(double memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this, state, cpuUsage, memoryUsage);
    }

    @Override
    public String toString() {
        return "VirtualMachine{" +
                "state='" + state + '\'' +
                ", cpuUsage=" + cpuUsage +
                ", memoryUsage=" + memoryUsage +
                '}';
    }
}
