package swings.examples;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BookTicketSwing {

	private static int row= 5, col = 7;
	private static int[][] seatsArr = new int[row][col];
	private static JPanel p;
	private final static MouseMotionAdapter bookDrag = new MouseMotionAdapter() {

		public void mouseDragged(MouseEvent e) 
		{
			Object o = p.getComponentAt(e.getX(), e.getY());
			if(o instanceof JLabel)
			{
				JLabel source = (JLabel)o;
				source.setBackground(Color.red);
				source.setOpaque(true);
				//JOptionPane.showMessageDialog(null, "Ticket booked ");
				String arr[]= source.getName().split("-");
				int x = Integer.parseInt(arr[0]);
				int y = Integer.parseInt(arr[1]);
				seatsArr[x][y] = 1;
				printArr();
			}
		}
	};
	private final static MouseAdapter panelBookClick = new MouseAdapter() {

		public void mouseClicked(MouseEvent e) 
		{
			Object o = p.getComponentAt(e.getX(), e.getY());
			if(o instanceof JLabel)
			{
				JLabel source = (JLabel)o;
				source.setBackground(Color.red);
				source.setOpaque(true);
				//JOptionPane.showMessageDialog(null, "Ticket booked ");
				String arr[]= source.getName().split("-");
				int x = Integer.parseInt(arr[0]);
				int y = Integer.parseInt(arr[1]);
				seatsArr[x][y] = 1;
				printArr();
			}
		}
	};
	public static void main(String[] args) 
	{
		JFrame frame = getFrame();
		JPanel panel = getMainPanel(row,col);
		p = panel;
		frame.add(panel);
		addSeats(panel,row,col);
	}
	private static JFrame getFrame()
	{
		JFrame frame = new JFrame("Book Ticket");
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		return frame;
	}
	private static JPanel getMainPanel(int row, int col)
	{
		JPanel panel = new JPanel();
		GridLayout gridLayout = new GridLayout(row,col);
		gridLayout.setHgap(5);
		gridLayout.setVgap(5);
		panel.setLayout(gridLayout);
		panel.addMouseMotionListener(bookDrag);
		panel.addMouseListener(panelBookClick);
		return panel;
	}
	private static void addSeats(JPanel panel,int row, int col)
	{
		int count = 1;
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				panel.add(getLabel(""+count, ""+i+"-"+j));
				count++;
			}
		}
	}
	private static JLabel getLabel(String text, String id)
	{
		JLabel label = new JLabel(text,JLabel.CENTER);
		label.setName(id);
		label.setBackground(Color.green);
		label.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
		label.setOpaque(true);
		return label;
	}
	private static void printArr()
	{
		System.out.println();
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(""+seatsArr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
