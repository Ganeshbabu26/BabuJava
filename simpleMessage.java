import javax.swing.*;
import java.awt.*;
class Display extends JPanel
{
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		String message = "Babu";
		g.setColor(Color.GREEN);
		Font font = new Font("Arial",Font.BOLD,20);
		FontMetrics f = g.getFontMetrics();
		g.setFont(font);
		int x = (getWidth() - f.stringWidth(message))/2;
		int y = (getHeight() - f.getHeight())/2 + f.getAscent();
		g.drawString(message,x,y);
	}
	public static void main(String args[])
	{
		JFrame frame = new JFrame("Applet viewer");
		Display b = new Display();
		frame.add(b);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
		