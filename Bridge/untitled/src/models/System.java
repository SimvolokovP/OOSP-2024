package models;

abstract public class System {
    protected Type type;

    public System(Type type) {
        this.type = type;
    }

    public abstract String work();
}
