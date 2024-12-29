package 喵喵喵;
import java.util.Scanner;
public class StudentGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String continueInput;
		do {
			System.out.print("Enter student name: ");
			String name = scanner.nextLine();
			
			System.out.print("Enter score for Subject 1: ");
			int score1 = scanner.nextInt();
			
			System.out.print("Enter score for Subject 2: ");
			int score2 = scanner.nextInt();
			
			System.out.print("Enter score for Subject 3: ");
			int score3 = scanner.nextInt();
			
			int total = score1 + score2 + score3;
			double average = total / 3.0;
			String grade;
			if (average >= 90) {
				grade = "A";
			} else if (average >= 80) {
				grade = "B";
			} else if (average >= 70) {
				grade = "C";
			} else if (average >= 60) {
				grade = "D";
			} else {
				grade = "F"; 
		    }
			System.out.println("\nStudent Name: " + name);
            System.out.println("Total Score: " + total);
            System.out.println("Average Score: " + average);
            System.out.println("Grade: " + grade);
            System.out.print("\nDo you want to enter other student's score? (yes/no): ");
            scanner.nextLine();
            continueInput = scanner.nextLine();
		} while (continueInput.equalsIgnoreCase("yes"));
		System.out.println("Program ended.");
		scanner.close();
	    }
}	
	    
			
