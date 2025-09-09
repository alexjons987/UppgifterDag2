import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n1. Temperature analysis");
            System.out.println("2. Class grading");
            System.out.println("3. Weekly bill");
            System.out.println("4. Shopping list");
            System.out.println("5. Number guessing game");
            System.out.print("Choose assignment 1-5 (0 = exit): ");
            int chosenAssignment = scanner.nextInt();

            switch (chosenAssignment) {
                case 0:
                    flag = false;
                    break;
                case 1:
                    Uppgift1.main(args);
                    break;
                case 2:
                    Uppgift2.main(args);
                    break;
                case 3:
                    Uppgift3.main(args);
                    break;
                case 4:
                    Uppgift4.main(args);
                    break;
                case 5:
                    Uppgift5.main(args);
                    break;
                default:
                    break;
            }
        }
        System.out.println("Bye bye!");
    }
}