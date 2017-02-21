import GameEngine.Loader;
import GameEngine.models.RawModel;
import GameEngine.Renderer;
import GameEngine.Window;
import GameEngine.models.TexturedModel;
import GameEngine.shader.StaticShader;
import GameEngine.textures.ModelTexture;
import org.lwjgl.opengl.Display;

public class GameEngineTest {

    public static Window mainWindow;


    public static void main(String[] args) {
        mainWindow = new Window();
        mainWindow.createDisplay(1280, 720);

        Loader loader = new Loader();
        Renderer renderer = new Renderer();
        StaticShader shader = new StaticShader();

        float[] textureCoords = {0, 0, 0, 1, 1, 1, 1, 0};
        float[] vertices = {-0.5f, 0.5f, 0f, -0.5f, -0.5f, 0f, 0.5f, -0.5f, 0f, 0.5f, 0.5f, 0f};
        int[] indices = {0, 1, 3, 3, 1, 2};

        RawModel model = loader.loadToVAO(vertices, textureCoords, indices);
        /**
         * Test Image from : http://kiiragames.weebly.com/textures.html
         */
        ModelTexture texture = new ModelTexture(loader.loadTexture("test"));
        TexturedModel texturedModel = new TexturedModel(model, texture);

        while (!Display.isCloseRequested()) {
            renderer.glInit();
            shader.start();
            renderer.render(texturedModel);
            shader.stop();
            mainWindow.updateDisplay(true);
        }

        shader.cleanUp();
        loader.cleanUp();
        mainWindow.closeDisplay();
    }
}
