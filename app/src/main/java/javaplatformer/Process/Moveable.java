package javaplatformer.Process;

import javaplatformer.Physics.Velocity;

public interface Moveable {
  public void move();

  public void moveX(float xDelta);

  public void moveY(float yDelta);

  public float getXVelocity();

  public float getYVelocity();

  public void accelerate(Velocity toAdd);

  public void stop();

  public boolean hasLeverage();

  public void setLeverage(boolean hasLeverage);
}
