package example;

public class DrawWithoutIOC {
	
	/**
	 * Creates a new Shape object
	 * and calls its draw method.
	 * 
	 * DrawWithoutIOC assumes that the
	 * Shape class's draw(String shapeType)
	 * method will determine the correct specific
	 * shape to create.
	 * 
	 * DrawWithoutIOC passes responsibility of creating
	 * a shape to the Shape class which then is responsible
	 * for creating the correct shape specific by the shapeType. 
	 * 
	 * @param shapeType
	 */
	public void draw(String shapeType) {
		Shape shape = new Shape();
		shape.draw(shapeType);
	}
	
	/**
	 * The high level object is created.
	 * Then the high level object
	 * creates the low level object it needs
	 * to call its draw() method. 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		DrawWithoutIOC without = new DrawWithoutIOC();
		without.draw("rectangle");
		without.draw("circle");
		
		/*
		 * Not directly supported from the get like DrawWithIOC. 
		 * Every time a subclass is created from any shape, 
		 * the Shape superclass's draw(String shapeType) method
		 * will have to be updated explicitly for support of that
		 * shape.
		 */
		without.draw("square");
		
		without.draw("right triangle");
	}
}
