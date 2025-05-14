package javaplatformer.GameLogic;

import java.awt.Color;

import javaplatformer.DataTransferObjects.PaintInformation;
import javaplatformer.Process.ProneToPhysics;

public class Player extends PhysicalObject implements ProneToPhysics {

    private int currentX;
    private int currentY;
    private int speed;

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public Player(Color color, int initialX, int initialY, int width, int height, int speed) {
        super(color, initialX, initialY, width, height);
        this.currentX = initialX;
        this.currentY = initialY;
        this.speed = speed;
    }

    @Override
    public PaintInformation getPaintInformation() {
        return new PaintInformation(this.getColor(), this.getCurrentX(), this.getCurrentY(), this.getWidth(),
                this.getHeight());
    }

}
