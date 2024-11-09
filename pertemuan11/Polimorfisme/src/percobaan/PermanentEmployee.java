package percobaan;
public class PermanentEmployee extends Employee implements Payable {
    private int salary;

    public PermanentEmployee (String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPaymentAmount() {
        return this.salary;
    }

    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo();
        info += "Registered as permanent employee with salary : " + this.salary + "\n";
        return info;
    }
}
