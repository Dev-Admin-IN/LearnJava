import java.util.Scanner;

public class Manager extends Employee {

    private double bonus;

    public void setBonus(double b) {
        bonus = b;
    }

    public void displayManager() {
        displayEmployee(); // inherited method
        System.out.println("Bonus         : " + bonus);
        System.out.println("Total Salary  : " + (salary + bonus));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Manager m = new Manager();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double sal = sc.nextDouble();

        System.out.print("Enter Bonus: ");
        double bonus = sc.nextDouble();

        m.setEmployeeDetails(id, name, sal); // parent method
        m.setBonus(bonus);

        System.out.println("\n--- Manager Details ---");
        m.displayManager();
        sc.close();
    }
}
