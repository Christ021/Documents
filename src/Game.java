import java.util.Scanner;

public class Game {
    
    public static void main(String args []) throws Exception {
        while (true) {

        
        
        Scanner scanner = new Scanner(System.in);
        String decision = "";

        
        System.out.print("Do you wanna build a snow man Yes or No: ");
        decision = scanner.nextLine();

        if (decision.equalsIgnoreCase("Yes")) {
            System.out.println("Tara laro tayo!");
            

        } else if (decision.equalsIgnoreCase("No")) {
            System.out.println("Edi wag!");
            
            
        } else {
            System.out.println("yes or no ngani");
            
        }

        System.out.print("TARA ISA PA? [Sige]/[Ayaw]: ");
        decision = scanner.nextLine();

        if (decision.equalsIgnoreCase("Sige")) {
            System.out.println("Tara isa pa!");
            continue;
        } else if (decision.equalsIgnoreCase("Ayaw")) {
            System.out.println("Okay, sige...");
            scanner.close();
            break;

        } else {
            System.out.print("Oo o Ayaw lang ngani!");
            continue;
        }
        




        

    }

        
    }
}
