import java.util.*;
public class Case {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the character");
        char c = sc.next().charAt(0);

        if(Character.isUpperCase(c))
            c = Character.toLowerCase(c);
        else
            c = Character.toUpperCase(c);
        
        System.out.println(c);
    }
}
