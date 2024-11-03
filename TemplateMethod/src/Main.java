import models.Bot;
import models.NPC;
import models.Player;
import models.Unit;

public class Main {
    public static void main(String[] args) {
        Unit player = new Player("RealPlayer226");
        Unit bot = new Bot("UltraSuperMegaBot227");
        Unit npc = new NPC("GoblinNPC228");

        player.update();
        bot.update();
        npc.update();
    }
}