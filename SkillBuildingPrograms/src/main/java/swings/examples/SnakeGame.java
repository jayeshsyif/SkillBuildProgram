package swings.examples;

import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SnakeGame {

	private static JButton button = null;
	private static int x=0, y=0, width=50, height=50;
	private static Rectangle frameBound = null;
	public static void main(String[] args) 
	{
		JFrame frame = getFrame();
		JPanel panel = getMainPanel();
		button = getButton(" S ", ""+123);
		panel.add(button);
		frame.add(panel);
	}
	private static JFrame getFrame()
	{
		JFrame frame = new JFrame("Snake game");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		frameBound = frame.getBounds();
		return frame;
	}
	private static JPanel getMainPanel()
	{
		JPanel panel = new JPanel();
		panel.setLayout(null);
		//panel.addKeyListener(keyAdapter);
		return panel;
	}
	private static JButton getButton(String text, String id)
	{
		JButton button = new JButton(text);
		button.setName(id);
		button.setBounds(x, y, width, height);
		button.setBackground(Color.green);
		button.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
		button.setOpaque(true);
		button.addKeyListener(keyAdapter);
		return button;
	}

	private static KeyAdapter keyAdapter = new KeyAdapter() {
		@Override
		public void keyPressed(KeyEvent e) 
		{
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
			{
				//left
				if(x>0)
				{
					x = x -10;
					button.setBounds(x, y, width, height);
				}
			}else if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			{
				//right
				if(x < frameBound.getWidth())
				{
					x = x +10;
					button.setBounds(x, y, width, height);
				}
			}else if (e.getKeyCode() == KeyEvent.VK_UP)
			{
				//up
				if(y>0)
				{
					y = y -10;
					button.setBounds(x, y, width, height);
				}
			}else if (e.getKeyCode() == KeyEvent.VK_DOWN)
			{
				if(y < frameBound.getHeight())
				{
					//down
					y = y +10;
					button.setBounds(x, y, width, height);
				}
			}
		}
	};
}
