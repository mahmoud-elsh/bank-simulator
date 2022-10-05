// Importing scanner class to allow for user input:
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        // Creation of scanner object:
        Scanner scanner = new Scanner(System.in);

        // Creation of bank account object:
        bankAccount accountOne = new bankAccount(0, 0, "", 0);

        // Creation of a menu using switch statements, user input, and declaring a counter variable. The counter variable determines whether to run the while loop; the user input and switch statement determines the method selected.
        int counter = 0;
        while (counter == 0) {
            System.out.println("\nHello! Welcome to my bank simulation! What operation would you like to perform today?");
            System.out.println("1) Update balance of your account. \n2) Update name of your account. \n3) Update ID number of your account. \n4) Update income of your account. \n5) Deposit money into your account. \n6) Withdraw money from your account. \n7) Get account information. \n8) Quit.");
            int userSelection = scanner.nextInt();

            switch (userSelection) {
                case 1:
                    // Fetches user input for setting new balance:
                    System.out.println("Please input new balance: ");
                    accountOne.setBalance(scanner.nextDouble());

                    // Fetches user input for selection if user wants to continue or not.
                    System.out.println("Thank you! Would you like to go back? \n1) Yes. \n2) No.");
                    int selection = scanner.nextInt();

                    if (selection == 1){
                        counter = 0;
                    } else {
                        counter++;
                    }
                    break;
                case 2:
                    System.out.println("Please input name: ");
                    // Skips current line:
                    scanner.nextLine();

                    // Fetches user input for name:
                    String inputName = scanner.nextLine();
                    accountOne.setName(inputName);

                    // Fetches user input for selection if user wants to continue or not.
                    System.out.println("Thank you! Would you like to go back? \n1) Yes. \n2) No.");
                    selection = scanner.nextInt();

                    if (selection == 1){
                        counter = 0;
                    } else {
                        counter++;
                    }
                    break;
                case 3:
                    // Fetches user input for ID number:
                    System.out.println("Please input your ID number: ");
                    accountOne.setIdNumber(scanner.nextInt());

                    // Fetches user input for selection if user wants to continue or not.
                    System.out.println("Thank you! Would you like to go back? \n1) Yes. \n2) No.");
                    selection = scanner.nextInt();

                    if (selection == 1){
                        counter = 0;
                    } else {
                        counter++;
                    }
                    break;
                case 4:
                    // Fetches user input for new income:
                    System.out.println("Please input your new income: ");
                    accountOne.setIncome(scanner.nextDouble());

                    // Fetches user input for selection if user wants to continue or not.
                    System.out.println("Thank you! Would you like to go back? \n1) Yes. \n2) No.");
                    selection = scanner.nextInt();

                    if (selection == 1){
                        counter = 0;
                    } else {
                        counter++;
                    }
                    break;
                case 5:
                    // Fetches user input to deposit money into account:
                    System.out.println("Please input the amount you want to deposit: ");
                    accountOne.deposit(scanner.nextDouble());

                    // Fetches user input for selection if user wants to continue or not.
                    System.out.println("Thank you! Would you like to go back? \n1) Yes. \n2) No.");
                    selection = scanner.nextInt();

                    if (selection == 1){
                        counter = 0;
                    } else {
                        counter++;
                    }
                    break;
                case 6:
                    // Fetches user input to withdraw money into account:
                    System.out.println("Please input the amount you want to withdraw ");
                    accountOne.withdraw(scanner.nextDouble());

                    // Fetches user input for selection if user wants to continue or not.
                    System.out.println("Thank you! Would you like to go back? \n1) Yes. \n2) No.");
                    selection = scanner.nextInt();

                    if (selection == 1){
                        counter = 0;
                    } else {
                        counter++;
                    }
                    break;
                case 7:
                    // Prints information about the account:
                    System.out.println(accountOne.getInfo());

                    // Fetches user input for selection if user wants to continue or not.
                    System.out.println("Thank you! Would you like to go back? \n1) Yes. \n2) No.");
                    selection = scanner.nextInt();

                    if (selection == 1){
                        counter = 0;
                    } else {
                        counter++;
                    }
                    break;
                case 8:
                    System.out.println("Thank you for using our service, goodbye!");
                    counter++;
                    break;
                default:
                    System.out.println("Number input is invalid, please select a number 1-8.");
            }
        }
    }
}
