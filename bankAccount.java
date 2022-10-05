public class bankAccount{
    // Declaring variables for object:
private double balance;
private double income;
private String name;
private int idNumber;

    // Constructor method:
    bankAccount(double balance, double income, String name, int idNumber){
        this.balance = balance;
        this.income = income;
        this.name = name;
        this.idNumber = idNumber;
    }

    // Mutator method to set balance of account:
    public void setBalance(double inputBalance){
        this.balance = inputBalance;
    }

    // Mutator method to set income of account:
    public void setIncome(double inputIncome){
        this.income = inputIncome;
    }

    // Mutator method to set name of account:
    public void setName(String inputName){
        this.name = inputName;
    }

    // Mutator method to set id number of account:
    public void setIdNumber(int inputIdNumber){
        this.idNumber = inputIdNumber;
    }

    // Method to deposit money into account:
    public double deposit(double amountDeposited){
        return this.balance += amountDeposited;
    }

    // Method to withdraw money from account:
    public double withdraw(double amountWithdrew){
        return this.balance -= amountWithdrew;
    }

    // Access method to get information of account:
    public String getInfo(){
        return "The current holder of the account is " + this.name + "." + "\nThis account currently has $" + this.balance + " and makes a monthly income of $" + this.income + "." + "\nThe ID number of this account is " + this.idNumber + ".";
    }


    public static void main(String[] args) {

    }

}
