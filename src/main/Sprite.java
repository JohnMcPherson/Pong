package main;

import java.awt.Color;
import java.awt.Rectangle;

public class Sprite {
    private int xPosition, yPosition;
    private int initialXPosition, initialYPosition;
    private int xVelocity, yVelocity;
    private int width, height;
    private Color colour;

    public void setInitialPosition(int initialXPosition, int initialYPosition) {
        this.initialXPosition = initialXPosition;
        this.initialYPosition = initialYPosition;
    }

    public void resetToInitialPosition() {
        setXPosition(initialXPosition);
        setYPosition(initialYPosition);
    }

    private int getWithinBounds(int proposedValue, int maximum) {
        if (proposedValue < 0) return 0;
        else if (proposedValue > maximum) return maximum;
        else return proposedValue;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setXPosition(int newX, int panelWidth) {
        this.xPosition = getWithinBounds(newX, panelWidth - width);
    }

    public int getXPosition() {
        return xPosition;
    }

    public void setYPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public void setYPosition(int newY, int panelHeight) {
        this.yPosition = getWithinBounds(newY, panelHeight - height);
    }

    public int getYPosition() {
        return yPosition;
    }

    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getxVelocity() {
        return xVelocity;
    }

    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }

    public int getyVelocity() {
        return yVelocity;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setColour(Color colour) {
        this.colour = colour;
    }

    public Color getColour() {
        return colour;
    }

    public Rectangle getRectangle() {
        return new Rectangle(getXPosition(), getYPosition(), getWidth(), getHeight());
    }
}
