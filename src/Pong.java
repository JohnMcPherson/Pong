import javax.swing.JFrame;

public class Pong extends JFrame {
    private static final String TITLE = "Pong";
    private static final int SCREEN_WIDTH = 800;
    private static final int SCREEN_HEIGHT = 600;
    private static final int POINTS_NEEDED_TO_WIN = 11;
    private static final int PADDLE_WIDTH = 6;
    private static final int PADDLE_HEIGHT = 20;

    public Pong() {
        setTitle(TITLE);
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pong();
    }
}
