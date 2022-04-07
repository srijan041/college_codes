import java.util.Scanner;

public class NumberToWord {
    
    static final String[] numName = {
        "Zero","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(("Enter number: "));
        String num = sc.nextLine();

        
        for(int i = 0; i < num.length(); i++){
            int n = Integer.parseInt(Character.toString(num.charAt(i)));
            System.out.print(numName[n] + " ");
        }
    }
}
