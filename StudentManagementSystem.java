package 喵喵喵;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> studentNames = new ArrayList<>();
		ArrayList<Double> studentGrades = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		
		while (running) {
			System.out.println("\nMenu:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. View all students");
            System.out.println("4. Calculate average grade");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) {
            	System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter student grade: ");
                double grade = scanner.nextDouble();
                studentNames.add(name);
                studentGrades.add(grade);
                System.out.println("Student added!");
            } else if (choice == 2) {
            	System.out.print("Enter the name of the student to remove: ");
                String removeName = scanner.nextLine();
                int index = studentNames.indexOf(removeName);
                if (index != -1) {
                    studentNames.remove(index);
                    studentGrades.remove(index);
                    System.out.println("Student removed!");
                } else {
                    System.out.println("Student not found!");
                }
            } else if (choice == 3) { 
                System.out.println("\nStudent List:");
                for (int i = 0; i < studentNames.size(); i++) {
                    System.out.println(studentNames.get(i) + " - " + studentGrades.get(i));
                }
            } else if (choice == 4) {
                if (studentGrades.isEmpty()) {
                    System.out.println("No students to calculate average grade.");
                } else {
                	double total = 0;
                    for (double g : studentGrades) {
                        total += g;
                    }
                    System.out.println("Average Grade: " + (total / studentGrades.size()));
                }
            } else if (choice == 5) {
            	System.out.println("Exiting the program. Goodbye!");
                running = false;
            } else {
            	System.out.println("Invalid choice! Please try again.");
            }
		}
		scanner.close();
	}

}
