package main;

import javax.swing.JFrame;

public class Pong extends JFrame {
    private static final String TITLE = "main.Pong";
    private static final int SCREEN_WIDTH = 800;
    private static final int SCREEN_HEIGHT = 600;

    public Pong() {
        setTitle(TITLE);
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        setResizable(false);
        add(new PongPanel());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pong();
            }
        });
    }
}
