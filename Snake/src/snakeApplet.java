import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;

public class snakeApplet extends Applet {

	private SnakeCanvas c;

	public void init() {
		c = new SnakeCanvas();
		c.setPreferredSize(new Dimension(640, 480));
		c.setVisible(true);
		c.setFocusable(true);
		this.add(c);
		this.setVisible(true);
		this.setSize(new Dimension(640, 480));
	}

	public void paint(Graphics g) {
		this.setSize(new Dimension(640, 480));
	}
}