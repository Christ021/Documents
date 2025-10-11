
import java.util.Scanner;

public class Rest { 
    public static void main(String[] args) throws Exception {
        while (true) {

            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Welcome to our Restaurant! ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("Here is our menu: ");
        System.out.println("A. Meals");
        System.out.println("B. Drinks");
    
        String choice = "";
        String c_meals = "";
        String c_drinks = "";
        String answer = "";
        
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Enter your order: ");
        choice = scanner.nextLine();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        if (choice.equalsIgnoreCase("A")) {
            System.out.println("You selected Meals. Here are the options:");
            System.out.println("A. Burger");
            System.out.println("B. Pizza");
            System.out.println("C. Salad");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("What is your preference: ");
            c_meals = scanner.nextLine();
            
            if (c_meals.equalsIgnoreCase("A")) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Your order of burger is on its way!");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

            } else if (c_meals.equalsIgnoreCase("B")) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Your order of pizza is on its way!");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

            } else if (c_meals.equalsIgnoreCase("C")) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Your order of Salad is on its way!");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            }

        } else if (choice.equalsIgnoreCase("B")) {
            System.out.println("You selected Drinks. Here are the options:");
            System.out.println("A. Soda");
            System.out.println("B. Coffee");
            System.out.println("C. Energy drink");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            System.out.print("What is your preference: ");
            c_drinks = scanner.nextLine();
            
            if (c_drinks.equalsIgnoreCase("A")) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Your cold soda is on its way!");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            } else if (c_drinks.equalsIgnoreCase("B")) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Your hot coffee is on its way!");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            } else if (c_drinks.equalsIgnoreCase("C")) {
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Your Energy drink is on its way!");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            }
        
        } else {
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Invalid choice. Please select A or B.");
            System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        }
        System.out.print("Do you want to order again? ");
            answer = scanner.nextLine();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");
        
        if (answer.equalsIgnoreCase("Yes")) {
            continue;
        }
        else if (answer.equalsIgnoreCase("No")) {
            System.out.println("Thank you for coming with us!");
            scanner.close();
            break;
        }
        else  {
            System.out.println("YES OR NO NGANI");
            
        }


        
    }
    }    
}    
