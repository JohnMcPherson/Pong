import java.awt.Color;

public class Sprite {
    private int xPosition, yPosition;
    private int xVelocity, yVelocity;
    private int width, height;
    private Color colour;

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getyPosition() {
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

    public void setColor(Color colour) {
        this.colour = colour;
    }

    public Color getColor() {
        return colour;
    }
}
