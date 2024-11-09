import models.StudioFacade;

public class Main {
    public static void main(String[] args) {

        StudioFacade studioFacade = new StudioFacade();
        studioFacade.selectSettings("Sea", "Tiny light");

        studioFacade.takePhoto();
    }
}