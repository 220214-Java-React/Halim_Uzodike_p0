import java.util.Scanner;

public class Registration {

        private Register register;

        public static void main(String[] args) {
                Account AccountObject = new Account();// Created Account object to use multiple classes.
                AccountObject.displayMenu();

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

                Register register = new Register();
                try(Scanner scanner = new Scanner(System.in)){ // Used scanner to read user input for their unique password, id and names.
                        System.out.println("Enter name -->  ");
                        String customerName = scanner.nextLine();
                        register.setcustomerName(customerName);

                        System.out.println("Enter ID -->  ");
                        String customerID = scanner.nextLine();
                        register.setcustomerID(customerID);

                        System.out.println("Enter password --> "); //Prints instructions for the user to enter their personal information, ID number and password.
                        String password = scanner.nextLine();
                        register.password(password);
                        
                        printRegisterData(register);
                }
        }

        private static void printRegisterData(Register register) {
                System.out.println(register.getCustomerID());
                System.out.println(register.getCustomerName());
                System.out.println(register.getPassword());
        }


}
class Register{
        private String customerName;
        private String customerID;
        private String password;
        public String getCustomerName(){
                return customerName;
        }
        public String getCustomerID(){
                return customerID;
        }
        public String getPassword(){
                return password;
        }

        public void setcustomerID(String customerID) {
        }

        public void setcustomerName(String customerName) {
        }

        public void password(String password) {
        }
}