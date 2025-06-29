import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Babu extends JFrame implements MouseListener{
	JLabel label;
	public Babu()
	{
		JFrame frame = new JFrame("Applet viewer");
		label = new JLabel();
		label.setFont(new Font("Arial",Font.BOLD,20));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText("Mouse Event");
		label.addMouseListener(this);
		frame.add(label);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	public void mouseClicked(MouseEvent e)
	{
		label.setText("Mouse clicked at: "+"("+e.getX()+","+e.getY()+")");
	}
	public void mousePressed(MouseEvent e)
	{
		label.setText("Mouse pressed");
	}
	public void mouseReleased(MouseEvent e)
	{
		label.setText("Mouse Released");
	}
	public void mouseEntered(MouseEvent e)
	{
		label.setText("Mouse entered");
	}
	public void mouseExited(MouseEvent e)
	{
		label.setText("Mouse Exited");
	}
	public static void main(String args[])
	{
		new Babu();
	}
}

		