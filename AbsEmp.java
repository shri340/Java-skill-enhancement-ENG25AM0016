abstract class Employee {

    abstract void calculateSalary();

    void companyName() {
        System.out.println("Company Name: ABC Technologies");
    }
}

class FullTime extends Employee {

    void calculateSalary() {
        System.out.println("Full Time Employee Salary: 40000");
    }
}

class PartTime extends Employee {

    void calculateSalary() {
        System.out.println("Part Time Employee Salary: 15000");
    }
}

public class AbsEmp {
    public static void main(String[] args) {

        FullTime f = new FullTime();
        PartTime p = new PartTime();

        f.companyName();
        f.calculateSalary();

        p.companyName();
        p.calculateSalary();
    }
}