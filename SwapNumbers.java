package 喵喵喵;
import java.util.Scanner;
public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		 System.out.print("Enter first number: "); 
	        int a = input.nextInt();
	        
	        System.out.print("Enter second number: "); 
	        int b = input.nextInt();
	        
	        System.out.println("Before swap: a = " + a + ", b = " + b);
	        
	        int temp = a; 
	        a = b; 
	        b = temp;
	        
	        System.out.println("After swap: a = " + a + ", b = " + b);
	        
	        input.close(); 
	        }
	    
	}


