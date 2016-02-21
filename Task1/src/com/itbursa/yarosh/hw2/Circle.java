package com.itbursa.yarosh.hw2;

public class Circle {
	private int centerX;
	private int centerY;
	private int radius;

	public Circle(int xCoord, int yCoord, int circleRadius) {

		this.centerX = xCoord;
		this.centerY = yCoord;
		this.radius = circleRadius;

	}

	public Circle(int circleRadius) {

		this.radius = circleRadius;

	}

	public void printCircle() {

		System.out.println("Circle with center in [" + centerX + "][" + centerY + "] and radius " + radius);
	};

	public void moveCircle(int dx, int dy) {

		centerX = +dx;
		centerY = +dy;
		System.out.println("Circle moved on dx [" + dx + "] and dy [" + dy + "]");
		printCircle();

	}

	/**
	 * Checks if specified point belongs to this circle
	 * 
	 * @param x
	 *            - x center coordinate of specified point
	 * @param y
	 *            - y center coordinate of specified point
	 * @return true if specified point belongs to this circle, if not - return
	 *         false
	 */
	public boolean isPointInCircle(int x, int y) {
		
		double h = 0;
		
		h = Math.sqrt(Math.pow(centerX,2)+Math.pow(centerY, 2));
		
		if(h>this.radius)return false;
		
		return true;
	}

	/**
	 * Checks if specified circle is in this circle
	 * 
	 * @param circle
	 *            - specified circle
	 * @return true if specified circle is in this circle, if not - return false
	 */
	public boolean isCircleInCurrentCircle(Circle circle) {
		
		
		
		return false;
	}

	
	@Override
	public String toString (){
		
		return super.toString();
		
	}
}
