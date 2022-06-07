package paintproject;

public class Rectangle extends Shape {

	private int legnth;
	private int width;

	public Rectangle(int length, int width) {

		this.shapename= Rectangle.class.getSimpleName();
		this.legnth = length;
		this.width = width;

	}

	@Override
	public double area() {

		return legnth * width;
	}

	@Override
	public String toString() {
		return "Rectangle [legnth=" + legnth + ", width=" + width + "]";
	}

}
