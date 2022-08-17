public class TestDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		
		DatabaseConnect r1 = new Rectangle(6, 5);
//		System.out.println(r1.toString());
//		r1.setColor("Green");
//		System.out.println(r1);

		
		Shape r2 = new Rectangle(6,5);
		System.out.println(r2);
		
		System.out.println(r1.equals(r2));
		
		//r1 = r2;
		
		System.out.println(r1.equals(r2));
		
//		r1.setColor("Black");
		System.out.println(r1);
		System.out.println(r2);
		

//		System.out.println("Rectangle Area = " + r1.getArea());
//		r1 = new Triangle(6, 5);
//		System.out.println("Rectangle Area = " + r1.getArea());
//
//		Triangle t1 = new Triangle(6, 5);
//		// System.out.println(t1.toString());
//		System.out.println(t1);
//		System.out.println("Triangle Area = " + t1.getArea());
	}

}
