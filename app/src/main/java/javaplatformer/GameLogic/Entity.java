package javaplatformer.GameLogic;

import java.awt.Color;

import javaplatformer.DataTransferObjects.PaintInformation;
import javaplatformer.DataTransferObjects.DEBUG.Debug;
import javaplatformer.Physics.Velocity;
import javaplatformer.Process.Moveable;

public class Entity extends PhysicalObject implements Moveable {
  private float currentX;
  private float currentY;
  private Velocity velocity;
  private boolean hasLeverage;

  private final float maxSpeed = 10;

  @Override
  public float getCurrentX() {
    return currentX;
  }

  @Override
  public float getCurrentY() {
    return currentY;
  }

  public void moveX(float xDelta) {
    this.currentX += xDelta;
  }

  public void moveY(float yDelta) {
    this.currentY += yDelta;
  }

  @Override
  public PaintInformation getPaintInformation() {
    return new PaintInformation(this.getColor(), this.getCurrentX(), this.getCurrentY(), this.getWidth(),
        this.getHeight());
  }

  public Entity(Color color, int initialX, int initialY, int width, int height, Velocity velocity) {
    super(color, initialX, initialY, width, height);
    this.currentX = initialX;
    this.currentY = initialY;
    this.velocity = velocity;
  }

  @Override
  public void move() {

    Debug.setFlag(String.format(" Added %f to x and %f to y", getXVelocity(), getYVelocity()));
  }

  public void pressureLeft() {
    Velocity newVelocity = Velocity.add(this.velocity, Velocity.leftwardsVelocityVector);
    if (newVelocity.getSpeed() <= maxSpeed) {
      if (newVelocity.getSpeed() >= 0) {
        this.velocity = newVelocity;
      } else {
        this.velocity = new Velocity(0, newVelocity.getDirection());
      }
    } else {
      this.velocity = new Velocity(maxSpeed, newVelocity.getDirection());
    }

  }

  public void pressureRight() {
    Velocity newVelocity = Velocity.add(this.velocity, Velocity.rightwardsVelocityVector);
    Debug.updateFlag(" Pressuring right.");
    if (newVelocity.getSpeed() <= maxSpeed) {
      if (newVelocity.getSpeed() >= 0) {
        this.velocity = newVelocity;
      } else {
        this.velocity = new Velocity(0, newVelocity.getDirection());
      }
    } else {
      this.velocity = new Velocity(maxSpeed, newVelocity.getDirection());
    }
  }

  public void pressureUp() {
    if (!hasLeverage)
      return;
    Velocity newVelocity = Velocity.add(this.velocity, Velocity.upawrdsVelocityVector);
    Debug.updateFlag(" Pressuring up.");
    if (newVelocity.getSpeed() <= maxSpeed) {
      if (newVelocity.getSpeed() >= 0) {
        this.velocity = newVelocity;
      } else {
        this.velocity = new Velocity(0, newVelocity.getDirection());
      }
    } else {
      this.velocity = new Velocity(maxSpeed, newVelocity.getDirection());
    }
  }

  public void pressureDown() {
    if (!hasLeverage)
      return;
    Debug.updateFlag(" Pressuring down.");
    Velocity newVelocity = Velocity.add(this.velocity, Velocity.downwardsVelocityVector);
    if (newVelocity.getSpeed() <= maxSpeed) {
      if (newVelocity.getSpeed() >= 0) {
        this.velocity = newVelocity;
      } else {
        this.velocity = new Velocity(0, newVelocity.getDirection());
      }
    } else {
      this.velocity = new Velocity(maxSpeed, newVelocity.getDirection());
    }
  }

  public float getXVelocity() {
    return this.velocity.getXVelocity();
  }

  public float getYVelocity() {
    return this.velocity.getYVelocity();
  }

  public float getDirection() {
    return this.velocity.getDirection();
  }

  public void stopLeft() {
    this.velocity.removeXComponent();
  }

  public void stopDown() {
    this.velocity.removeYComponent();
  }

  public void stopUp() {
    this.velocity.removeYComponent();
  }

  public void stopRight() {
    this.velocity.removeXComponent();
  }

  public boolean hasLeverage() {
    return hasLeverage;
  }

  public void setLeverage(boolean hasLeverage) {
    this.hasLeverage = hasLeverage;
  }

  @Override
  public void stop() {
    this.velocity = Velocity.zeroVector;
  }

  @Override
  public void accelerate(Velocity toAdd) {
    this.velocity = Velocity.add(this.velocity, toAdd);
  }

}
