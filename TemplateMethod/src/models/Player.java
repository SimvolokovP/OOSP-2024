package models;

public class Player extends Unit {
    public Player(String nickName) {
        super(nickName);
    }

    @Override
    protected void toPerform() {
        System.out.println("Real Player with nickname " + nickName + " in game");
    }
}
