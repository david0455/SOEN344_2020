package solid.ocp.conformance;

import java.awt.Graphics;

public class Rectangle {

	private int topLeftX;
	private int topLeftY;
	private int width;
	private int height;
	
	public Rectangle(int topLeftX, int topLeftY, int width, int height) {
		this.topLeftX = topLeftX;
		this.topLeftY = topLeftY;
		this.width = width;
		this.height = height;
	}

	public int getTopLeftX() {
		return topLeftX;
	}

	public int getTopLeftY() {
		return topLeftY;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
