import java.util.*;
public class AlphabeticalOrder {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first character: ");
        char first = sc.next().charAt(0);

        System.out.print("Enter second character: ");
        char second = sc.next().charAt(0);

        if(Character.compare(first, second) < 0)
            System.out.println(first + " " + second);
        else
            System.out.println(second + " " + first);

    }
}
