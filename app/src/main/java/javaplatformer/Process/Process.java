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
                100,
                100,
                new Velocity((float) 0.0, (float) Math.PI));
        List<PhysicalObject> gameObjects = List.of(
                player,
                new Platform(
                        Color.WHITE,
                        0,
                        100,
                        1080,
                        100),
                new Platform(
                        Color.WHITE,
                        480,
                        300,
                        1080,
                        100));
        JFrame frame = new GameFrame("Simple platformer", player);
        GamePanel panel = new GamePanel(gameObjects);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
