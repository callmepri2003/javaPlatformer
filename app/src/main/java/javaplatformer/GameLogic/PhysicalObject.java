package javaplatformer.GameLogic;

import java.awt.Color;

import javaplatformer.Process.Paintable;

public abstract class PhysicalObject implements Paintable {

    private int initialX;
    private int initialY;
    private int height;
    private int width;
    private Color color;

    public int getInitialX() {
        return initialX;
    }

    public int getInitialY() {
        return initialY;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Color getColor() {
        return color;
    }

    public float getMass() {
        return ((float) (width * height)) / 100;
    }

    public PhysicalObject(Color color, int initialX, int initialY, int width, int height) {
        this.initialX = initialX;
        this.height = height;
        this.width = width;
        this.initialY = initialY;
        this.color = color;
    }

}
