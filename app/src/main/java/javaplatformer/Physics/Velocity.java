package javaplatformer.Physics;

public class Velocity {
  private float speed;
  private float radians;

  public static final Velocity upawrdsVelocityVector = new Velocity(2, (float) (1 * Math.PI / 2));

  public static final Velocity leftwardsVelocityVector = new Velocity(2, (float) (2 * Math.PI / 2));

  public static final Velocity downwardsVelocityVector = new Velocity(2, (float) (3 * Math.PI / 2));

  public static final Velocity rightwardsVelocityVector = new Velocity(2, (float) (4 * Math.PI / 2));

  public static final Velocity zeroVector = new Velocity(0, 0);

  public static Velocity add(Velocity vel1, Velocity vel2) {
    float xComponent = vel1.getXVelocity() + vel2.getXVelocity();
    float yComponent = vel1.getYVelocity() + vel2.getYVelocity();
    float resultantSpeed = (float) Math.sqrt((xComponent * xComponent) + (yComponent * yComponent));
    float direction = (float) Math.atan2(yComponent, xComponent);
    if (resultantSpeed == 0.0) {
      return zeroVector;
    }
    return new Velocity(resultantSpeed, direction);
  }

  public float getXVelocity() {
    return ((float) (Math.abs(this.speed) * Math.cos(radians)));
  }

  public float getYVelocity() {
    return (float) (Math.abs(this.speed) * Math.sin(radians));
  }

  public void removeXComponent() {
    float y = getYVelocity();
    float newSpeed = Math.abs(y); // speed is always positive
    float newDirection = y > 0 ? (float) (Math.PI / 2) // Up
        : y < 0 ? (float) (3 * Math.PI / 2) // Down
            : 0f; // No vertical movement

    if (newSpeed == 0.0f) {
      newDirection = 0f;
    }
    this.speed = Math.abs(newSpeed);
    this.radians = newDirection;
  }

  public void removeYComponent() {
    float x = getXVelocity();
    float newSpeed = Math.abs(x); // speed is always positive
    float newDirection = x > 0 ? 0f // Right
        : x < 0 ? (float) Math.PI // Left
            : 0f; // No horizontal movement

    if (newSpeed == 0.0f) {
      newDirection = 0f;
    }
    this.speed = Math.abs(newSpeed);
    this.radians = newDirection;
  }

  public void accelerate(float speed) {
    this.speed += speed;
  }

  public float getDirection() {
    return radians;
  }

  public void changeDirection(float radians) {
    this.radians = radians;
  }

  public Velocity(float speed, float radians) {
    this.radians = radians;
    this.speed = Math.abs(speed);
  }

  public float getSpeed() {
    return speed;
  }
}
