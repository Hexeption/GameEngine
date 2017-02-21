import org.lwjgl.opengl.Display;

public class GameEngineTest {

    public static Window mainWindow;

    public static void main(String[] args) {
        mainWindow = new Window();
        mainWindow.createDisplay(1280, 720);

        while (!Display.isCloseRequested()) {
            mainWindow.updateDisplay(true);
        }

        mainWindow.closeDisplay();
    }
}
