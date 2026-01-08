import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Holder Name: ");
        acc.setAccountHolderName(sc.nextLine());

        System.out.print("Enter Initial Deposit: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter Withdraw Amount: ");
        acc.withdraw(sc.nextDouble());

        System.out.println("\n--- Account Details ---");
        System.out.println("Name    : " + acc.getAccountHolderName());
        System.out.println("Balance : " + acc.getBalance());

        sc.close();
    }
}
