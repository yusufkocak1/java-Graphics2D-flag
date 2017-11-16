package com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;
import javax.swing.Timer;

public class board extends JPanel implements ActionListener {

	private double angle = 0;
	private double x = 0;

	board() {
		Timer timer = new Timer(100, this);
		timer.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		setBackground(Color.red);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.WHITE);
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		g2d.setRenderingHint(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);

		Area a3 = new Area(new Ellipse2D.Double(75, 70, 300, 300));
		Area a4 = new Area(new Ellipse2D.Double(140, 95, 250, 250));

		a3.subtract(a4);
		g2d.fill(a3);
		

		g2d.rotate(angle, 400, 210);
		new stars_poligon().Paint(g2d);
		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					x = -10;
					break;
				case KeyEvent.VK_RIGHT:
					x = 10;
					break;
				case KeyEvent.VK_SPACE:
					x = 0;
					break;
				case KeyEvent.VK_UP:
					if (x < 0)
						x -= 0.01;
					else
						x += 0.01;
					break;
				case KeyEvent.VK_DOWN:
					if (x >= 0)
						x -= 0.01;
					else
						x += 0.01;
				}
			}
		});

		setFocusable(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		angle += Math.tan(Math.toRadians(x));
		repaint();
	}

}
