import org.lwjgl.opengl.Display;

/**
 * Created by Keir on 21/02/2017.
 */
public class GameEngineTest {

    public static void main(String[] args) {
        Window.createDisplay();

        while (!Display.isCloseRequested()){
            Window.updateDisplay();
        }

        Window.closeDisplay();
    }
}
