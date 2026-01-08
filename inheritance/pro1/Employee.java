public class Employee {

    protected int empId;
    protected String empName;
    protected double salary;

    public void setEmployeeDetails(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    public void displayEmployee() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
    }
}
