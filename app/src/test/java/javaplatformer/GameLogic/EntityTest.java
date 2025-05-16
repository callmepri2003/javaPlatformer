package javaplatformer.GameLogic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import javaplatformer.Physics.Velocity;

public class EntityTest {
  @Test
  public void OccupiesSpaceWorks() {
    Player newPlayer = new Player(Color.LIGHT_GRAY, 300, 500, 100, 100, new Velocity((float) 0, (float) Math.PI));
    boolean outcome = newPlayer.occupiesCoordinate(350, 450);
    assertEquals(true, outcome);

    outcome = newPlayer.occupiesCoordinate(250, 350);
    assertEquals(false, outcome);

    outcome = newPlayer.occupiesCoordinate(250, 450);
    assertEquals(false, outcome);

    outcome = newPlayer.occupiesCoordinate(350, 550);
    assertEquals(false, outcome);

    outcome = newPlayer.occupiesCoordinate(450, 350);
    assertEquals(false, outcome);

    outcome = newPlayer.occupiesCoordinate(450, 450);
    assertEquals(false, outcome);

    outcome = newPlayer.occupiesCoordinate(450, 550);
    assertEquals(false, outcome);

    outcome = newPlayer.occupiesCoordinate(350, 550);
    assertEquals(false, outcome);

    outcome = newPlayer.occupiesCoordinate(350, 350);
    assertEquals(false, outcome);
  }
}
