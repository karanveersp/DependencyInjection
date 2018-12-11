package example;

public class RightTriangle extends Shape {
	private double height;
	private double base;
	private double hypotenuse;
	
	/**
	 * Default constructor with height = 4, base = 3, hypotenuse = 5
	 */
	public RightTriangle() {
		height = 4;
		base   = 3;
		hypotenuse = 5;
	}
	
	public RightTriangle(int height, int base, int hypotenuse) {
		this.height = Math.abs(height);
		this.base   = Math.abs(base);
		this.hypotenuse = Math.abs(hypotenuse);
	}
	
	public RightTriangle(int height, int base) {
		this.height = Math.abs(height);
		this.base   = Math.abs(base);
		this.hypotenuse = Math.sqrt((height * height) + (base * base));
	}
	
	/**
	 * Overrides Shape's draw() method
	 */
	@Override
	public void draw() {
		System.out.println("A right triangle is drawn!");
	}
	
	/**
	 * Overrides Shape's getArea() method
	 */
	@Override
	public double getArea() {
		return 0.5 * height * base;
	}
}
