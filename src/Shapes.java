// Importing Scanner to recieve input from user at a later stage
import java.util.Scanner;
public class Shapes {

	public static void main(String[] args) {
		
		//Introduction Message
		Scanner scan = new Scanner(System.in);
		System.out.println("-------------------------");
		System.out.println("Welcome to Math Made Easy");
		System.out.println("-------------------------");
		System.out.println(" ");
		
		// System asks user which shape they want to calculate area of or perimeter using a scanner
		System.out.println("Which shape is is? (Square or Circle)");
		String Shape = scan.next();
		
		//switch statement to execute Square code or Circle code
		switch (Shape.toUpperCase()) { 
		case "SQUARE": 
						//System asks user whether they want to calculate area or perimeter of the Square, scanner function is used to receive answer
						System.out.println("Would you like to calculate its 'area' or its 'perimeter'?");
						String Type = scan.next();
						Type = Type.toLowerCase();
						
						//System asks user to input the length of 1 side of the square, scanner function is used to receive answer
						System.out.println("How large is it? (enter side length)");
						double lengthSquare = scan.nextDouble();
						
						/* Switch statement is used to calculate the area in the first case or the perimeter in the second depending on
						 * what the user has entered earlier */
							switch (Type){
							case "area":
									// Area of Square is calculated using length x length
									double areaSquare = lengthSquare*lengthSquare;
									System.out.println("The area of a " + Shape + " of size " + lengthSquare + " is " + areaSquare);
									break; // breaks area case
								
							case "perimeter":	
								// Perimeter of Square is calculated using length x 4
									double periSquare = lengthSquare*4;
									System.out.println("The perimeter of " + Shape + " of size " + lengthSquare + " is " + periSquare);
									break; // breaks perimeter case
						}		
					break; // Breaks Square case
			
		case "CIRCLE": 
			//System asks user whether they want to calculate area or perimeter of the Circle, scanner function is used to receive answer
						System.out.println("Would you like to calculate its 'area' or its 'perimeter'?");
						String Type2 = scan.next();
						Type2 = Type2.toLowerCase();	
						
						//System asks user to input the diameter of the Circle, scanner function is used to receive answer
						System.out.println("How large is it? (enter side diameter)");
						double diameterCircle = scan.nextDouble();
						
						/* Switch statement is used to calculate the area in the first case or the perimeter in the second depending on
						 * what the user has entered earlier */
							switch (Type2){
							case "area":
								// Area is calculated using the formula (𝜋 x (d/2)^2)
									double areaCircle = (Math.PI) * ((diameterCircle/2) * (diameterCircle/2));
									System.out.println("The area of a " + Shape + " of diameter " + diameterCircle + " is " + areaCircle);
									break; // breaks area case
								// Perimeter is calculated using the formula (2𝜋 * (d/2))
							case "perimeter":	
									double periCircle = (2*(Math.PI))*(diameterCircle/2);
									System.out.println("The perimeter of " + Shape + " of diameter " + diameterCircle + " is " + periCircle);
									break; // breaks perimeter case
						}
					break; // Breaks Circle case
		}

	}

}
