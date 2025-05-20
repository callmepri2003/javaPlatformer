package javaplatformer.GameLogic;

import java.awt.Color;

import javaplatformer.Process.Moveable;
import javaplatformer.Process.Paintable;

public abstract class PhysicalObject implements Paintable {

    private float initialX;
    private float initialY;
    private float height;
    private float width;
    private Color color;

    public float getInitialX() {
        return initialX;
    }

    public float getInitialY() {
        return initialY;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public Color getColor() {
        return color;
    }

    public float getMass() {
        return ((float) (width * height)) / 100;
    }

    public boolean occupies(Paintable other) {
        float thisLeft = getCurrentX();
        float thisRight = thisLeft + getWidth();
        float thisTop = getCurrentY();
        float thisBottom = thisTop - getHeight();

        float otherLeft = other.getCurrentX();
        float otherRight = otherLeft + other.getWidth();
        float otherTop = other.getCurrentY();
        float otherBottom = otherTop - other.getHeight();

        // Axis-Aligned Bounding Box (AABB) collision check
        return thisLeft < otherRight &&
                thisRight > otherLeft &&
                thisTop > otherBottom &&
                thisBottom < otherTop;
    }

    public PhysicalObject(Color color, int initialX, int initialY, int width, int height) {
        this.initialX = initialX;
        this.height = height;
        this.width = width;
        this.initialY = initialY;
        this.color = color;
    }

}
