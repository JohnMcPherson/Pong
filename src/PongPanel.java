import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongPanel extends JPanel implements ActionListener, KeyListener {

    private static final Color BACKGROUND_COLOR = Color.BLACK;
    private static final int POINTS_NEEDED_TO_WIN = 11;
    private static final int PADDLE_WIDTH = 6;
    private static final int PADDLE_HEIGHT = 20;

    public PongPanel() {
        setBackground(BACKGROUND_COLOR);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent event) {

    }

    @Override
    public void keyPressed(KeyEvent event) {

    }

    @Override
    public void keyReleased(KeyEvent event) {

    }
}
