
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Main extends JPanel
{

	private static final long serialVersionUID = 1L;

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		Pong.pong.render((Graphics2D) g);
	}

}
