package javaplatformer.Process;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;

import javax.swing.JFrame;

import javaplatformer.DataTransferObjects.DEBUG.Debug;
import javaplatformer.GameLogic.Player;

public class GameFrame extends JFrame implements KeyListener {

  Player player;

  public GameFrame(String title, Player player) {
    super(title);
    this.player = player;
    this.addKeyListener(this);
  }

  @Override
  public void keyTyped(KeyEvent e) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
  }

  @Override
  public void keyPressed(KeyEvent e) {
    Debug.updateFlag("Key has been pressed.");
    switch (e.getKeyChar()) {
      case 'a':
        System.out.println("going left.");
        player.pressureLeft();
        break;
      case 's':
        System.out.println("going down.");
        player.pressureDown();
        break;
      case 'd':
        System.out.println("going right.");
        player.pressureRight();
        break;
      case 'w':
        System.out.println("going up.");
        player.pressureUp();
        break;
      default:
        break;
    }
  }

  @Override
  public void keyReleased(KeyEvent e) {
    Debug.setFlag("Key has been released.");
    switch (e.getKeyChar()) {
      case 'a':
        player.stopLeft();
        break;
      case 's':
        player.stopDown();
        break;
      case 'd':
        player.stopLeft();
        break;
      case 'w':
        player.stopDown();
        break;
      default:
        break;
    }
  }

}
