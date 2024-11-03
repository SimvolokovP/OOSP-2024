package models;

abstract public class Unit {
    protected String nickName;
    public final void update() {
        toPerform();
    }

    public Unit(String nickName) {
        this.nickName = nickName;
    }

    protected abstract void toPerform();
}
