import java.util.Scanner;

public class Palindrome {
    
    int isPalindrome(int num, int rev){
        if(num > 0){
            return isPalindrome(num/10, rev*10 + num%10);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = 0;
        int rev = 0;

        num = sc.nextInt();
        Palindrome ob = new Palindrome();
        if(ob.isPalindrome(num, rev) == num){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Palindrome");

    }
}
