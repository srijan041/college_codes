package general;

class Employee {
    protected int empid;
    private String ename;

    int baseSalary;

    Employee(int id, String name, int salary) {
        empid = id;
        ename = name;
        baseSalary = salary;
    }

    public double earnings() {
        return baseSalary + 0.8 * baseSalary + 0.15 * baseSalary;
    }
}
