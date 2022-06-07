package paintproject;

public class Cylinder extends Shape {

	private int radius;
	private int height;
	double PI = 3.14;

	public Cylinder(int radius, int height) {

		this.shapename= Cylinder.class.getSimpleName();
		this.radius = radius;
		this.height = height;

	}

	@Override
	public double area() {
		return PI * (radius * radius) * height;
	}

	@Override
	public String toString() {
		return "Cylinder [radius=" + radius + ", height=" + height + ", PI=" + PI + "]";
	}

}
