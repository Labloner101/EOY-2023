
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Game extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener {
	private BufferedImage back;

	private int Key;

	public Game() {
		new Thread(this).start();
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);

	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread();
				Thread.sleep(5);
				repaint();
			}
		} catch (Exception e) {
		}
	}

	public void paint(Graphics g) {
		Graphics2D twoDgraph = (Graphics2D) g;

		if (back == null) {
			back = (BufferedImage) (createImage(getWidth(), getHeight()));
		}

		Graphics g2d = back.createGraphics();

		g2d.clearRect(0, 0, getSize().width, getSize().height);

		twoDgraph.drawImage(back, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

		// int x = e.getX();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		Key = e.getKeyCode();
		System.out.println(" key is " + Key);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
