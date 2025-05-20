package javaplatformer.Process;

import java.awt.Color;
import java.util.List;

import javax.swing.JFrame;

import javaplatformer.GameLogic.PhysicalObject;
import javaplatformer.GameLogic.Platform;
import javaplatformer.GameLogic.Player;
import javaplatformer.Physics.Velocity;

public class Process {

        public static void main(String[] args) {
                Player player = new Player(
                                Color.LIGHT_GRAY,
                                300,
                                250,
                                20,
                                20,
                                new Velocity((float) 0.0, (float) Math.PI));
                List<PhysicalObject> gameObjects = List.of(
                                player,
                                new Platform(Color.WHITE, 0, 650, 1080, 20), // Ground platform
                                new Platform(Color.WHITE, 200, 580, 150, 20),
                                new Platform(Color.WHITE, 500, 550, 200, 20),
                                new Platform(Color.WHITE, 850, 520, 120, 20),
                                new Platform(Color.WHITE, 100, 480, 150, 20),
                                new Platform(Color.WHITE, 400, 440, 200, 20),
                                new Platform(Color.WHITE, 700, 400, 180, 20),
                                new Platform(Color.WHITE, 300, 370, 140, 20),
                                new Platform(Color.WHITE, 50, 340, 120, 20),
                                new Platform(Color.WHITE, 600, 310, 180, 20),
                                new Platform(Color.WHITE, 880, 280, 160, 20),
                                new Platform(Color.WHITE, 400, 250, 200, 20),
                                new Platform(Color.WHITE, 150, 220, 140, 20),
                                new Platform(Color.WHITE, 700, 200, 160, 20),
                                new Platform(Color.WHITE, 500, 160, 180, 20),
                                new Platform(Color.WHITE, 280, 120, 150, 20),
                                new Platform(Color.WHITE, 50, 90, 100, 20),
                                new Platform(Color.WHITE, 800, 80, 120, 20),
                                new Platform(Color.WHITE, 1000, 60, 60, 20), // right edge small platform
                                new Platform(Color.WHITE, 350, 30, 120, 20));
                JFrame frame = new GameFrame("Simple platformer", player);
                GamePanel panel = new GamePanel(gameObjects);

                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setResizable(true);
                frame.add(panel);
                frame.pack();
                frame.setVisible(true);
        }
}
