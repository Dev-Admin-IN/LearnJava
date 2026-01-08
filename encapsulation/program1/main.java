public class Main {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.setEmpId(101);
        e.setEmpName("Lavanya");
        e.setSalary(25000);

        System.out.println("Employee ID   : " + e.getEmpId());
        System.out.println("Employee Name : " + e.getEmpName());
        System.out.println("Salary        : " + e.getSalary());
    }
}
