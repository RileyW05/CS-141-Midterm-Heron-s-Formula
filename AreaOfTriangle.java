//@author Riley Wagner
import java.util.Scanner;

public class AreaOfTriangle {
	
	public static void main (String[] args) {
		
		Scanner console = new Scanner(System.in);
		triangleArea(console, 0, 0, 0);
	}

	public static double triangleArea(Scanner console, double a, double b, double c){
		if(console == null) {
			throw new IllegalArgumentException("Scanner does not exist.");		//throws exception if scanner argument is null.
		}
		System.out.print("Enter a value for \"a\":");
			a = console.nextDouble();				//prompts for user input for side a of the triangle.
				if(a <= 0) {
					throw new IllegalArgumentException("Please enter a value greater than 0.");
				}
		System.out.print("Enter a value for \"b\":");
			b = console.nextDouble();			//prompts for user input for side b of the triangle.
				if(b <= 0) {
					throw new IllegalArgumentException("Please enter a value greater than 0.");
				}
		System.out.print("Enter a value for \"c\":");
			c = console.nextDouble();					//prompts for user input for side c of the triangle.
				if(c <= 0) {
					throw new IllegalArgumentException("Please enter a value greater than 0.");
				}

			System.out.println();

			var s =(a + b + c) / 2;
				var area = Math.sqrt(s * (s - a) * (s - b) * (s - c));		//calculates area of triangle using Heron's Formula.

		if(Double.isNaN(area)) {
			throw new IllegalArgumentException("Given values cannot make a triangle.");		//exception thrown if sides don't make a triangle.
		}
		return(area);
	}
}

