import java.util.*;
public class Student {
    int roll;
    String name;
    double fullMarks;
    double securedMarks;

    Student(int roll, String name, double fullMarks, double securedMarks){
        this.fullMarks = fullMarks;
        this.name = name;
        this.securedMarks = securedMarks;
        this.roll = roll;
    }

    double getCGPA(){
        return ((securedMarks*1.0)/fullMarks)*100;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        System.out.println("Enter roll: ");
        int roll = sc.nextInt();
        System.out.println("Enter fullmarks: ");
        double fullMarks = sc.nextDouble();
        System.out.println("Enter secured marks: ");
        double securedMarks = sc.nextDouble();
        Student s = new Student(roll, name, fullMarks, securedMarks);

        System.out.println("Output: ");
        System.out.println(
            "Name: " + s.name +
            "\nRoll: " + s.roll + 
            "\nSecured Marks: " + s.securedMarks +
            "\nFull Marks: " + s.fullMarks + 
            "\nCGPA: " + s.getCGPA()
        );
    }
}
