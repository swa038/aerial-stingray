package inf112.roborally;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import inf112.roborally.screens.ScreenManager;

public class Main {

    /**
     * Num. of horizontal tiles x size of tiles
     */
    public final static int WIDTH = 1440;

    /**
     * Num. of vertical tiles x size of tiles + height of deck-layout
     */
    public final static int DECK_WINDOW_SIZE = 280;
    public final static int HEIGHT = 720 + DECK_WINDOW_SIZE;

    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = "RoboRally by aerial-stingray";
        cfg.width = WIDTH;
        cfg.height = HEIGHT;

        new LwjglApplication(ScreenManager.getInstance(), cfg);
    }
}