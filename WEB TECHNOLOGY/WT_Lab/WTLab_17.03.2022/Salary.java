import java.util.Scanner;

interface Office{
    double earning();
    double deductions();
    double bonus();
}


abstract class Manager implements Office{
    Scanner sc = new Scanner(System.in);
    double basicSalary;

    Manager(double base){
        basicSalary = base;
    }

    public double earning(){

        return (basicSalary + 0.8*basicSalary + 0.15*basicSalary);
    }

    public double deductions(){
        return (0.12*basicSalary);
    }
}

class SubStaff extends Manager{
    SubStaff(double base){
        super(base);
    }

    public double bonus(){
        return (0.5*basicSalary);
    }
}


public class Salary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        SubStaff ss = new SubStaff(sc.nextDouble());
        
        System.out.println("Earning: " + ss.earning());
        System.out.println("Deductions: " + ss.deductions());
        System.out.println("Bonus: " + ss.bonus());

    
    }

}