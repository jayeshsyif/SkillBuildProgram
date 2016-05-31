package swings.examples;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
  public static void main(String[] argv) throws Exception {
    JButton component = new JButton();
    component.addKeyListener(new MyKeyListener());

    JFrame f = new JFrame();

    f.add(component);
    f.setSize(300, 300);
    f.setVisible(true);

  }
}

class MyKeyListener extends KeyAdapter {
  public void keyPressed(KeyEvent evt) {
    if (evt.getKeyChar() == 'a') {
      System.out.println("Check for key characters: " + evt.getKeyChar());
    }
    if (evt.getKeyCode() == KeyEvent.VK_HOME) {
      System.out.println("Check for key codes: " + evt.getKeyCode());
    }
  }
}