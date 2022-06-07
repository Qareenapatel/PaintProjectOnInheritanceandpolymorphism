package paintproject;

public abstract class Shape {

	protected String shapename;

	abstract double area();

	
	
	
	public String getShapename() {
		return shapename;
	}




	public void setShapename(String shapename) {
		this.shapename = shapename;
	}




	@Override
	public String toString() {
		return "Shape [shapename=" + shapename + "]";
	}

	
	}


