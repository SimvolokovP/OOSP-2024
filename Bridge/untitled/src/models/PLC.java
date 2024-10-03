package models;

public class PLC extends System {
    public PLC(Type type) {
        super(type);
    }

    @Override
    public String work() {
        return type.work();
    }
}