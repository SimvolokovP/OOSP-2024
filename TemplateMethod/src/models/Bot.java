package models;

public class Bot extends Unit{
    public Bot(String nickName) {
        super(nickName);
    }

    @Override
    protected void toPerform() {
        System.out.println("Bot Player with nickname " + nickName + " in game");
    }
}
