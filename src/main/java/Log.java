import java.util.Scanner;

public class Log {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter ID number --> ");
            String customerID = scanner.nextLine();

            System.out.println("Enter password --> ");
            String password = scanner.nextLine();

            if("HAL123".equals(customerID) && "qwerty".equals(password)){
                System.out.println(" Login successful ");
            }
            else{
                System.out.println("Invalid ID or password");
            }
        }
    }
}
