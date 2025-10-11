import java.util.Scanner;

public class Grading {

    public static void main(String args []) {
        while (true) {
        Scanner scanner = new Scanner(System.in);
        
        
        int failed = 74;
        int passed = 75;
        int honorsgrade = 85;
        int highhonors = 90;
        int highest = 95;
        int valedictorian = 99;
        
        System.out.print("Input your grade: ");
        int Grade = scanner.nextInt();
        scanner.nextLine();
            
        if (Grade >= valedictorian) {
            System.out.println("Congratulations you are a Valedictorian!");
        } else if (Grade >= highest) {
            System.out.println("Congratulations you have highest honors!");
        } else if (Grade >= highhonors) {
            System.out.println("Congratulations you have high honors!");
        }   else if (Grade >= honorsgrade) {
            System.out.println("Congratulations you are with honors!");
        } else if (Grade >= passed) {
            System.err.println("Congratulations you have passed!");
        } else if (failed >= 1) {
            System.out.println("You have failed, I'm sorry..");
        } else {
            System.out.println("Number ngani");
        }

        System.out.println("Wanna input another grade? ");
        System.out.print("Yes or no: ");
        String answer = scanner.nextLine();
    
        if (answer.equalsIgnoreCase("Yes")) { 
            continue;
        } else if (answer.equalsIgnoreCase("No")) {
            System.out.println("Thank you for your time!");
            scanner.close();
            break;
        } else {
            System.out.print("Input your numbers please!");
            continue;
        }


        
    }

    }

}
