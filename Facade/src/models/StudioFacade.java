package models;

public class StudioFacade {
    private Background background;
    private Lighting lighting;
    private Camera camera;

    public StudioFacade() {
        background = new Background();
        lighting = new Lighting();
        camera = new Camera();
    }

    public void selectSettings(String background, String lighting) {
        this.background.selectBackground(background);
        this.lighting.selectLighting(lighting);
    }

    public void takePhoto() {
        camera.takePhoto();
    }

    @Override
    public String toString() {
        return "StudioFacade{" +
                "background=" + background +
                ", lighting=" + lighting +
                '}';
    }
}
