package javaplatformer.Process;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

import javaplatformer.DataTransferObjects.PaintInformation;
import javaplatformer.GameLogic.Physics;

public class GamePanel extends JPanel {

    private final int WIDTH = 1080;
    private final int HEIGHT = 720;

    private List<Paintable> paintables;
    private Physics physics = new Physics();

    public void newObject(Paintable paintable) {
        paintables.add(paintable);
        if (paintable instanceof ProneToPhysics obj) {
            physics.addObjectToUniverse(obj);
        }
    }

    public GamePanel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
        paintables = new ArrayList<>();
        Timer timer = new Timer(16, e -> {
            physics.tick();
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < paintables.size(); i++) {
            PaintInformation info = paintables.get(i).getPaintInformation();
            g.setColor(info.getColor());
            g.fillRect(info.getxPos(), info.getyPos(), info.getWidth(), info.getHeight());
        }
    }
}
