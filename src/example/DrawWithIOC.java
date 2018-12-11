package example;

/**
 * In this class, the Shape is passed as parameter to DrawWithIOC   
 * constructor. 
 * draw method on a DrawWithIOC object just invokes the draw method  
 * on Shape object. 
 * It, no longer, manages the creation of Shape object based on 
 * shapeType and there upon, invoke the draw method.
 **/
public class DrawWithIOC {
	
	// The class just knows it will
	// store a shape. Which shape exactly?
	// To be determined at runtime!
	// With polymorphism!
	private Shape shape;	
	
	/**
	 * Constructor takes a shape. It can be
	 * an object of the Shape class or a Shape subclass
	 * 
	 * @param shape
	 */
	public DrawWithIOC(Shape shape) {
		this.shape = shape;				// Any subclasses of Shape can be upcast to Shape
	}
	
	/**
	 * Polymorphism at work. 
	 * The Shape object that was provided in the constructor
	 * and assigned to the field, that object's draw() method
	 * is called. 
	 * 
	 * DrawWithIOC does not know anything about which shape its drawing. 
	 * It's just drawing a shape. That's all. 
	 * 
	 * If an invalid shape is requested, then that error will be caught at
	 * compile time because an invalid shape cannot be assigned
	 * to the Shape field. 
	 */
	public void draw() {
		this.shape.draw();
	}
	
	/**
	 * The application creates the low level objects
	 * before creating the high level object.
	 * Through runtime polymorphism, the high level
	 * object will call the draw() method of the
	 * whatever shape it receives. 
	 * 
	 * No checking is required for which shape is given. 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Shape shape = new Square();
		DrawWithIOC with = new DrawWithIOC(shape);
		with.draw();
		System.out.println("It\'s area is " + shape.getArea());
		
		
		shape = new Shape();
		with = new DrawWithIOC(shape);
		with.draw();
		System.out.println("It\'s area is " + shape.getArea());

		
		
		shape = new Rectangle();
		with = new DrawWithIOC(shape);
		with.draw();
		System.out.println("It\'s area is " + shape.getArea());

		
		shape = new RightTriangle();
		with = new DrawWithIOC(shape);
		with.draw();
		System.out.println("It\'s area is " + shape.getArea());

	}
}
