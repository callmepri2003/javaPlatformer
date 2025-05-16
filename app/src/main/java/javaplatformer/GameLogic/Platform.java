package javaplatformer.GameLogic;

import java.awt.Color;

import javaplatformer.DataTransferObjects.PaintInformation;

public class Platform extends PhysicalObject {

    public Platform(Color color, int initialX, int initialY, int width, int height) {
        super(color, initialX, initialY, width, height);
    }

    @Override
    public PaintInformation getPaintInformation() {

        return new PaintInformation(getColor(), getInitialX(), getInitialY(), getWidth(), getHeight());
    }

}
