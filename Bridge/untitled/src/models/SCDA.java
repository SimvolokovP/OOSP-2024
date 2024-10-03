package models;

public class SCADA extends System {
    public SCADA(Type type) {
        super(type);
    }

    @Override
    public String work() {
        return type.work();
    }
}
