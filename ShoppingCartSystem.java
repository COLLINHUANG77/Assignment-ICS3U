package 喵喵喵;
import java.util.ArrayList;
import java.util.Scanner;
public class ShoppingCartSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] products = {"Laptop", "Smartphone", "Headphones", "Keyboard", "Mouse"};
        double[] prices = {1000.0, 600.0, 150.0, 80.0, 40.0};
        
        ArrayList<String> cart = new ArrayList<>();
        ArrayList<Double> cartPrices = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
          
            System.out.println("\nMenu:");
            System.out.println("1. View Items");
            System.out.println("2. Add Item to Cart");
            System.out.println("3. Remove Item from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Checkout");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            if (choice == 1) { 
                System.out.println("\nAvailable Products:");
                for (int i = 0; i < products.length; i++) {
                    System.out.println((i + 1) + ". " + products[i] + " - $" + prices[i]);
                }
            } else if (choice == 2) { 
                System.out.print("Enter the product number to add to the cart: ");
                int productNumber = scanner.nextInt();

                if (productNumber >= 1 && productNumber <= products.length) {
                    cart.add(products[productNumber - 1]);
                    cartPrices.add(prices[productNumber - 1]);
                    System.out.println(products[productNumber - 1] + " added to cart!");
                } else {
                    System.out.println("Invalid product number!");
                }
            } else if (choice == 3) { 
                System.out.print("Enter the product number to remove from the cart: ");
                int removeNumber = scanner.nextInt();

                if (removeNumber >= 1 && removeNumber <= cart.size()) {
                    String removedItem = cart.remove(removeNumber - 1);
                    cartPrices.remove(removeNumber - 1);
                    System.out.println(removedItem + " removed from cart!");
                } else {
                    System.out.println("Invalid cart item number!");
                }
            } else if (choice == 4) { 
                System.out.println("\nCart Contents:");
                for (int i = 0; i < cart.size(); i++) {
                    System.out.println((i + 1) + ". " + cart.get(i) + " - $" + cartPrices.get(i));
                }
                if (cart.isEmpty()) {
                    System.out.println("Your cart is empty.");
                }
            } else if (choice == 5) {
                double total = 0;
                for (double price : cartPrices) {
                    total += price;
                }
                System.out.println("\nTotal Amount: $" + total);
                System.out.println("Thank you for shopping!");
                running = false;
            } else if (choice == 6) { 
                System.out.println("Exiting the program. Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid choice! Please try again.");
            }
        }

        scanner.close();
    }
}

