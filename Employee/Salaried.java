package Employee;

public class Salaried {
    protected String Emp_name;
    protected int Emp_id;
    protected int Age;
    protected String Address;
    protected double Salary;
    protected int Years_of_experience;
    protected String Department_name;

    public void getSalariedData(String name, int id, int age, String address, double salary, int exp, String dept) {
        this.Emp_name = name;
        this.Emp_id = id;
        this.Age = age;
        this.Address = address;
        this.Salary = salary;
        this.Years_of_experience = exp;
        this.Department_name = dept;
    }

    public void printSalariedData() {
        System.out.println("Employee Name: " + Emp_name);
        System.out.println("Employee ID: " + Emp_id);
        System.out.println("Age: " + Age);
        System.out.println("Address: " + Address);
        System.out.println("Salary: $" + Salary);
        System.out.println("Years of Experience: " + Years_of_experience);
        System.out.println("Department: " + Department_name);
    }
}