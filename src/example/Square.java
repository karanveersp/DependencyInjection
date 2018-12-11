package example;

public class Square extends Rectangle {
	private double length;
	
	/**
	 * Default constructor where length = 2
	 */
	public Square() {
		length = 2;
	}
	
	public Square(double length) {
		this.length = length;
	}
	
	/**
	 * Draws a square
	 */
	@Override
	public void draw() {
		System.out.println("A square is drawn!");
	}
	
	/**
	 * Returns length squared
	 */
	@Override
	public double getArea() {
		return length * length;
	}
}
