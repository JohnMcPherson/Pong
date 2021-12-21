package main;

import java.awt.*;

public class Ball extends Sprite {
    final static Color BALL_COLOUR = Color.WHITE;
    final static int BALL_WIDTH = 25;
    final static int BALL_HEIGHT = 25;

    public Ball (int panelWidth, int panelHeight) {
        setWidth(BALL_WIDTH);
        setHeight(BALL_HEIGHT);
        setColour(BALL_COLOUR);
        setInitialPosition((panelWidth - getWidth())/2, (panelHeight - getHeight())/2);
        resetToInitialPosition();

    }
}
