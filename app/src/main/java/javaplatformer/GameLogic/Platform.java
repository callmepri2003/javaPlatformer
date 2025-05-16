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

    @Override
    public boolean occupiesCoordinate(float xCord, float yCord) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'occupiesCoordinate'");
    }

}
