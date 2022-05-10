//@author Riley Wagner
import java.util.Scanner;

public class AreaOfTriangle {
	
	public static void main (String[] args) {
		
		Scanner console = new Scanner(System.in);
		triangleArea(console, 0, 0, 0);
	}

	public static void triangleArea(Scanner console, double a, double b, double c){
		if(console == null) {
			throw new IllegalArgumentException("Scanner does not exist.");
		}
		System.out.print("Enter a value for \"a\":");
			a = console.nextDouble();
				if(a <= 0) {
					throw new IllegalArgumentException("Please enter a value greater than 0.");
				}
		System.out.print("Enter a value for \"b\":");
			b = console.nextDouble();
				if(b <= 0) {
					throw new IllegalArgumentException("Please enter a value greater than 0.");
				}
		System.out.print("Enter a value for \"c\":");
			c = console.nextDouble();
				if(c <= 0) {
					throw new IllegalArgumentException("Please enter a value greater than 0.");
				}

			System.out.println();

			var s =(a + b + c) / 2;
				var area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		if(Double.isNaN(area)) {
			throw new IllegalArgumentException("Given values cannot make a triangle.");
		}
		System.out.print(area);
	}
}

