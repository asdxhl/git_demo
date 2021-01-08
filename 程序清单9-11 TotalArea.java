public class TotalArea {
	/**Main method */
	public static void main(String[] args) {
		// Declare circleArray
		Circle[] circleArray;
		
		// Create circleArray
		circleArray = createCircleArray();
		
		// Print circleArray and total areas of the circles
		printCircleArray(circleArray);
	}
	/** Create an array of Circle objects */
	public static Circle[] createCircleArray() {
		Circle[] circleArray = new Circle[5];
		for (int i=0;i<circleArray.length;i++) {
			circleArray[i]=new Circle(Math.random()*100);
		}
		// Return Circle array
		return circleArray;
	}
	
	/** Print an array of circles and their total area  */
	public static void printCircle(Circle[] circleArray) {
		System.out.println("%-30s%-15s\n","Radius","Area");
		for (int i=0;i<circleArray.length;i++) {
			System.out.println("%-30f%-15f\n",circleArray[i].getRadius(),
					circleArray[i].getArea());
		}
		System.out.println("__________________________________");
		
		// Compute and display the result
		System.out.println("%-30s%-15f\n","The total area of circle is",
				sum(circleArray));
	}
	
	/** Add circle areas */
	public static double sum(Circle[] circleArray) {
		// Initialize sum
		double sum=0;
		
		// Add areas to sum
		for (int i=0;i<circleArray.length;i++)
			sum += circleArray[i].getArea();
		return sum;
	}

}
