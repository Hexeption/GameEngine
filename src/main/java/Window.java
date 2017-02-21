import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.*;

public class Window {

    private int width;
    private int HEIGHT;

    public void createDisplay(int width, int height) {
        this.width = width;
        this.HEIGHT = height;

        ContextAttribs attribs = new ContextAttribs(3, 2).withForwardCompatible(true).withProfileCore(true);
        try {
            Display.setDisplayMode(new DisplayMode(this.width, HEIGHT));
            Display.create(new PixelFormat(), attribs);
        } catch (LWJGLException e) {
            e.printStackTrace();
        }

        GL11.glViewport(0, 0, this.width, HEIGHT);
    }

    public void updateDisplay(boolean VSync) {
        Display.setVSyncEnabled(VSync);
        Display.update();
    }

    public void closeDisplay() {
        Display.destroy();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return HEIGHT;
    }
}
