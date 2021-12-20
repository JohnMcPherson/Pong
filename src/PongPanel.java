import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class PongPanel extends JPanel implements ActionListener, KeyListener {

    private static final Color BACKGROUND_COLOR = Color.BLACK;
    private static final int TIMER_DELAY = 5;
    private static final int POINTS_NEEDED_TO_WIN = 11;
    private static final int PADDLE_WIDTH = 6;
    private static final int PADDLE_HEIGHT = 20;

    public PongPanel() {
        setBackground(BACKGROUND_COLOR);
        Timer timer = new Timer(TIMER_DELAY, this);
            timer.start();
    }

    private void update() {

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        update();
        repaint();
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

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(20, 20, 100, 100);
        g.setColor(Color.RED);
        g.drawOval(160,160,160,160);
    }
}
