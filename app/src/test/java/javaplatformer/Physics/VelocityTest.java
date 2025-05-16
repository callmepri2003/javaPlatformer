package javaplatformer.Physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VelocityTest {

  @Test
  public void VelocitiesAddProperly() {
    Velocity vel1 = Velocity.leftwardsVelocityVector;
    Velocity vel2 = Velocity.rightwardsVelocityVector;
    Velocity resultantVector = Velocity.add(vel1, vel2);
    Velocity expectedVector = new Velocity(0, 0);
    assertEquals(resultantVector.getXVelocity(), expectedVector.getXVelocity(), 1e-6);
    assertEquals(resultantVector.getYVelocity(), expectedVector.getYVelocity(), 1e-6);
  }

}
