package javaplatformer.Process;

import java.awt.Color;

import javax.swing.JFrame;

import javaplatformer.GameLogic.Platform;
import javaplatformer.GameLogic.Player;

public class Process {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple platformer");
        GamePanel panel = new GamePanel();

        panel.newObject(new Player(Color.LIGHT_GRAY, 300, 500, 100, 100, 1));
        panel.newObject(new Platform(Color.WHITE, 0, 620, 1080, 100));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
