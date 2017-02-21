package GameEngine.shader;

public class StaticShader extends ShaderProgram {

    private static final String VERTEX_FILE = "src/main/java/GameEngine/shader/VertexShader.glsl";
    private static final String FRAG_FILE = "src/main/java/GameEngine/shader/FragShader.glsl";

    public StaticShader() {
        super(VERTEX_FILE, FRAG_FILE);
    }

    @Override
    protected void bindAttributes() {
        super.bindAttribute(0, "position");
        super.bindAttribute(1, "textureCoords");

    }
}

