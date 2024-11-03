package models;

public class NPC extends Unit{
    public NPC(String nickName) {
        super(nickName);
    }

    @Override
    protected void toPerform() {
        System.out.println("NPC Player with nickname " + nickName + " in game");
    }
}
