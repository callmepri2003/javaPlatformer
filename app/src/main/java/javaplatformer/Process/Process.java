package javaplatformer.Process;

import javax.swing.*;

public class Process {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Simple platformer");
    JPanel panel = new GamePanel();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.add(panel);
    frame.pack();
    frame.setVisible(true);
  }
}
