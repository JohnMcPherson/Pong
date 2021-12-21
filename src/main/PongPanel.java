package main;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongPanel extends JPanel implements ActionListener, KeyListener {

    private static final Color BACKGROUND_COLOR = Color.BLACK;
    private static final int TIMER_DELAY = 5;
    private static final int POINTS_NEEDED_TO_WIN = 11;
    private static final int PADDLE_WIDTH = 6;
    private static final int PADDLE_HEIGHT = 20;
    private boolean gameInitialised;
    private Ball ball;

    public PongPanel() {
        setBackground(BACKGROUND_COLOR);
        Timer timer = new Timer(TIMER_DELAY, this);
            timer.start();
    }

    private void createObjects() {
        ball = new Ball(getWidth(), getHeight());
     }

    private void update() {
        if (!gameInitialised) {
            createObjects();
            gameInitialised = true;
        }
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
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        paintDottedLine(graphics);
        if(gameInitialised) {
            paintSprite(graphics, ball);
        }
    }

    private void paintDottedLine(Graphics graphics) {
        Graphics2D graphics2D = (Graphics2D) graphics.create();
        Stroke dashed = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
        graphics2D.setStroke(dashed);
        graphics2D.setPaint(Color.WHITE);
        graphics2D.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
        graphics2D.dispose();
    }

    private void paintSprite(Graphics g, Sprite sprite) {
        g.setColor(sprite.getColour());
        g.fillRect(sprite.getXPosition(), sprite.getYPosition(), sprite.getWidth(), sprite.getHeight());
    }
}
