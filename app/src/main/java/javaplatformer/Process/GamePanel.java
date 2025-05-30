package javaplatformer.Process;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

import javaplatformer.DataTransferObjects.PaintInformation;
import javaplatformer.DataTransferObjects.DEBUG.Debug;
import javaplatformer.GameLogic.PhysicalObject;
import javaplatformer.Physics.Universe;
import javaplatformer.GameLogic.Player;

public class GamePanel extends JPanel {

    private final int WIDTH = 1080;
    private final int HEIGHT = 720;

    private List<Paintable> paintables;
    Universe universe;

    private void newObject(Paintable paintable) {
        paintables.add(paintable);
        universe.participate(paintable);
    }

    public GamePanel(List<PhysicalObject> gameObjects) {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        paintables = new ArrayList<>();
        universe = Universe.getOrCreateUniverse();

        for (PhysicalObject obj : gameObjects) {
            newObject(obj);
        }

        Timer timer = new Timer(16, e -> {
            universe.tick();
            repaint();
        });
        timer.start();

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Player player = null;
        for (int i = 0; i < paintables.size(); i++) {
            PaintInformation info = paintables.get(i).getPaintInformation();
            g.setColor(info.getColor());
            g.fillRect(Math.round(info.getxPos()), Math.round(this.HEIGHT - info.getyPos()), (int) info.getWidth(),
                    (int) info.getHeight());
            if (paintables.get(i) instanceof Player obj) {
                player = obj;
            }
        }
        if (player != null && Debug.debug) {
            g.drawString("X Velocity:", 50, 50);
            g.drawString(String.valueOf(player.getXVelocity()), 50, 70);
            g.drawString("Y Velocity:", 50, 90);
            g.drawString(String.valueOf(player.getYVelocity()), 50, 110);
            g.drawString("Direction", 50, 130);
            g.drawString(String.valueOf(player.getDirection()), 50, 150);
            g.drawString("X Pos", 50, 170);
            g.drawString(String.valueOf(player.getCurrentX()), 50, 190);
            g.drawString("Y Pos", 50, 210);
            g.drawString(String.valueOf(player.getCurrentY()), 50, 230);
            g.drawString("Debug:", 50, 250);
            g.drawString(String.valueOf(Debug.getFlag()), 50, 270);

        }
    }
}
