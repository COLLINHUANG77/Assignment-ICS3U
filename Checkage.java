package 喵喵喵;
import java.util.Scanner;
public class Checkage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean continueChecking = true;
		
		while (continueChecking) {
			System.out.print("Enter your age: ");
			if (scanner.hasNextInt()) {
				int age = scanner.nextInt();
				if (age < 0) {
					System.out.println("Invalid input. Age cannot be negative. Please try again.");
				} else if (age >= 18) {
					System.out.println("You are eligible to vote!");
				} else {
					int yearsLeft = 18 - age;
					System.out.println("You are not eligible to vote. You can vote in " + yearsLeft + " years.");
				 }
			 } else {
				 System.out.println("Invalid input. Please enter a numeric value.");
				 scanner.next(); // Clear invalid input
				 continue;
				}
			System.out.print("Do you want to check another age? (yes/no): ");
			 String response = scanner.next().toLowerCase();
			 
			 if (response.equals("no")) {
				 continueChecking = false;
				 System.out.println("Thank you!");
			}
		}
		scanner.close();
	}

}
