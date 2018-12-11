package example;

public class Shape {
	public void draw() {
		System.out.println("A shape is drawn!");
	}
	
	public double getArea() {
		return 0.0;
	}
	
	/**
	 * The parent class method is taking the 
	 * responsibility of initializing its child
	 * classes and calling their respective
	 * draw() method.
	 * 
	 * @param shapeType
	 */
	public void draw(String shapeType) {
		switch(shapeType) {
		case "rectangle":
			Rectangle rectangle = new Rectangle();
			rectangle.draw();
			break;
		case "right triangle":
			RightTriangle rightTriangle = new RightTriangle();
			rightTriangle.draw();
			break;
		default:
			System.out.println("Shape " + shapeType + " not supported");
			break;
		}
	}
}
