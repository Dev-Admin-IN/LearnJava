import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.print("Enter Employee ID: ");
        e.setEmpId(sc.nextInt());
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        e.setEmpName(sc.nextLine());
        System.out.print("Enter Salary: ");
        e.setSalary(sc.nextDouble());
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID   : " + e.getEmpId());
        System.out.println("Employee Name : " + e.getEmpName());
        System.out.println("Salary        : " + e.getSalary());
        sc.close();
    }
}