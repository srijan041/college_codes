import java.util.*;
public class AddAllDigits {
    
    int returnSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AddAllDigits ob = new AddAllDigits();

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Sum of " + num + " = " + ob.returnSum(num));
    }
}
