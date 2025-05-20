package javaplatformer.Process;

public interface Moveable {
  public void move();

  public void moveX(float xDelta);

  public void moveY(float yDelta);

  public float getXVelocity();

  public float getYVelocity();
}
