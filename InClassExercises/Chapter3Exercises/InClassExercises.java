import java.util.Scanner;

public class InClassExercises {
	public static void main(String args[]) {
		rightTriangleStars();
	}
	
	public static void simpleIfDemo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a #: ");
		int number = input.nextInt();
		if(number % 5 == 0) {
			System.out.println("High 5");
		}
		else if(number % 2 == 0) {
			System.out.println("High even");
		}
		input.close();
	}
	
	public static void rightTriangleStars() {
		for(int i = 0; i <= 8; i++) {
			System.out.print("\n");
			for(int j = 0; j < i; j++) {
				System.out.print(" * ");
			}
		}
	}
	
	public static void subtractionGame() {
		
	}
	
	public static void randIntToSqr() {
		int rand = (int) (Math.pow((int) (Math.random()*10), 2)); // make whole number before bring to the power of 2.
		System.out.print(rand);

	}
	
	public static void andOrXor() {
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = input.nextInt();
		
		if(number % 2 == 0 && number % 3 == 0){
			System.out.printf("%d is evenly divisible by 2 and 3 \n", number);
		}else if(number % 2 == 0 || number % 3 == 0){
			System.out.printf("%d is evenly divisible by either 2 or 3 \n", number);
		}else if(number % 2 == 0 && number % 3 == 0){
			System.out.printf("%d is evenly divisible by either 2 or 3 \n", number);
		}
		input.close();
	}
	
	public static int switchStatement(int number){
		switch (day){				
			case 1:
				System.out.println("Monday");
				break;
			case 2:
			       	System.out.println("Tueday");
				break;
			case 3:
			       	System.out.println("Wednesday");
				break;
		 	case 4:
			       	System.out.println("Thursday");
				break;
			case 5:
			       	System.out.println("Friday");
				break;
			case 6:
			       	System.out.println("Saturday");
				break;
			case 7: System.out.println("Sunday");
				break;
			default:
				System.out.println("Please enter a valid number from 1-7")
	{
}