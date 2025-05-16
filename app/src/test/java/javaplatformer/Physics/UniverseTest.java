package javaplatformer.Physics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import javaplatformer.GameLogic.Player;

public class UniverseTest {
  @Test
  public void GravityWorks() {
    Player newPlayer = new Player(Color.LIGHT_GRAY, 300, 500, 100, 100, new Velocity((float) 0, (float) Math.PI));
    Universe universe = Universe.getOrCreateUniverse();
    universe.participate(newPlayer);
    universe.tick();
    assertEquals(newPlayer.getCurrentX(), 300, 1e-3);
    assertEquals(newPlayer.getCurrentY(), 490.2, 1e-3);
  }
}
