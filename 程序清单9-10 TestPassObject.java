public class TestPassObject {
	/**Main method */
	public static void main(String[] args) {
		// Create a Circle object with radius 1
		Circle myCircle=
				new Circle(1);//Use the Circle class in Listing 9.8
		
		//Print areas for radius 1,2,3,4,and5.
		int n=5;
		printAreas(myCircle,n);
		
		//See myCircle.radius and times
		System.out.println("\n"+"Radius is "+myCircle.getArea());
		System.out.println("n is "+n);
	}
	/** Print a table if areas for radius */
	public static void printAreas(Circle c,int times) {
		System.out.println("Radius \t\tArea");
		while(times>=1) {
			System.out.println(c.getRadius()+"\t\t"+c.getArea());
			c.getRadius(c.getRadius()+1);
			times--;
		}
	}

}
