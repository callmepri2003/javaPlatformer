package javaplatformer.Process;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
  private final int WIDTH = 1080;
  private final int HEIGHT = 720;

  // Player
  private int playerX = 100;
  private int playerY = 500;
  private int playerWidth = 50;
  private int playerHeight = 50;

  // Ground
  private int groundY = 550; // y-position of the ground
  private int groundHeight = 50;

  public GamePanel() {
    setPreferredSize(new Dimension(WIDTH, HEIGHT));
    setBackground(Color.BLACK);

    Timer timer = new Timer(16, e -> repaint());
  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw ground
    g.setColor(Color.GREEN);
    g.fillRect(0, groundY, WIDTH, groundHeight);

    // Draw player
    g.setColor(Color.RED);
    g.fillRect(playerX, playerY, playerWidth, playerHeight);
  }
}
