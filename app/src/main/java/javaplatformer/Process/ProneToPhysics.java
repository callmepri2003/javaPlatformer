package javaplatformer.Process;

import javaplatformer.Physics.Velocity;

public interface ProneToPhysics extends Paintable {
    public void move();

    public void accelerate(Velocity additionalVelocity);

}
