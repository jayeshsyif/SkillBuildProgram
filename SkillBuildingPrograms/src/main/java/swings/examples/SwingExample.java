package swings.examples;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SwingExample 
{
	static JPanel j =null;
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Example");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JButton button = new JButton();
		button.setText("Example");
		button.addActionListener(numberListener);
		panel.add(button);

		JLabel jLabel = new JLabel("Test");
		jLabel.setName("test");
		panel.add(jLabel);
		j = panel;
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	private final static ActionListener numberListener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			for(Component comp:j.getComponents())
			{
				if(comp.getName() != null)
				{
					if(comp.getName().equalsIgnoreCase("test"))
					{
						JLabel l = (JLabel) comp;
						l.setText("Changed");
						break;
					}
				}
			}
		}
	};

}
