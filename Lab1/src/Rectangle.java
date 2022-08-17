public class Rectangle extends Shape implements DatabaseConnect {

	private int length;
	private int width;

	public Rectangle() {
		this.length = 0;
		this.width = 0;
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}
	
	public String toString(){   //override
		if (color == null) {
			color = "red";
			return "Area : "+getArea()+" Color : " + color;
		} else {
			return "Area : "+getArea()+" Color : " + color;
		}
	}

	public void insert() {
		// TODO Auto-generated method stub
		
	}

	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void read() {
		// TODO Auto-generated method stub
		
	}
	

}
