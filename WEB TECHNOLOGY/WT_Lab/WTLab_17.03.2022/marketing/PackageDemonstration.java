package marketing;

import general.*;

class Sales extends Employee {

    Sales(int id, String name, int salary) {
        super(id, name, salary);
    }

    double tallowance() {
        return 0.05 * earnings();
    }
}

public class PackageDemonstration {

    public static void main(String[] args) {
        Sales s = new Sales(2005834, "Srijan", 5000);

        System.out.println("Travel allowance = " + s.tallowance()
                + " for Emp Id = " + empid);
    }
}
