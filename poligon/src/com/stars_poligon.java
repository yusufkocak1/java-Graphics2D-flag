package com;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class stars_poligon {

	private final double points[][] = { { 300, 185 }, { 375, 175 },
			{ 400, 110 }, { 425, 175 }, { 500, 185 }, { 450, 225 },
			{ 460, 290 }, { 400, 250 }, { 340, 290 }, { 350, 225 },
			{ 300, 185 } };
	private int angle = 0;

	void Paint(Graphics2D g) {

		Graphics2D g2d = (Graphics2D) g.create();
		GeneralPath star = new GeneralPath();
		star.moveTo(points[0][0], points[0][1]);

		for (int k = 1; k < points.length; k++)
			star.lineTo(points[k][0], points[k][1]);

		star.closePath();
		g2d.fill(star);

	}
}
