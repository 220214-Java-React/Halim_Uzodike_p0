import java.util.Scanner;

public class Registration {

        public static void main(String[] args) {
                Register register = new Register();
                try(Scanner scanner = new Scanner(System.in)){ // Used scanner to read user input for their unique password, id and names.
                        System.out.println("Enter name -->  ");
                        String customerName = scanner.nextLine();
                        register.setcustomerName(customerName);

                        System.out.println("Enter ID -->  ");
                        String customerID = scanner.nextLine();
                        register.setcustomerID(customerID);

                        System.out.println("Enter password --> ");
                        String password = scanner.nextLine();
                        register.password(password);
                }
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