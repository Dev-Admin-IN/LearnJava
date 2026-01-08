public class Employee {
    private int empId;
    private String empName;
    private double salary;
    public void setEmpId(int id) {
        empId = id;
    }
    public void setEmpName(String name) {
        empName = name;
    }
    public void setSalary(double sal) {
        if (sal > 0) {
            salary = sal;
        } else {
            System.out.println("Invalid salary");
        }
    }
    public int getEmpId() {
        return empId;
    }
    public String getEmpName() {
        return empName;
    }
    public double getSalary() {
        return salary;
    }
}