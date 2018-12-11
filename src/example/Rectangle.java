package example;

public class Rectangle extends Shape {
	private double length;
	private double width;
	
	/**
	 * Default constructor sets length = 4, width = 2
	 */
	public Rectangle() {
		length = 4;
		width  = 2;
	}
	
	/**
	 * Constructor with parameters
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		this.length = Math.abs(length);
		this.width  = Math.abs(width);
	}
	
	/**
	 * Overrides Shape's draw() method
	 */
	@Override
	public void draw() {
		System.out.println("A rectangle is drawn!");
	}
	
	/**
	 * Overrides Shape's getArea() method
	 */
	@Override
	public double getArea() {
		return length * width;
	}
}
