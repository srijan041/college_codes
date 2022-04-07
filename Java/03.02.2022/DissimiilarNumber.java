import java.util.*;
public class DissimiilarNumber {
    
    int returnNumber(String num){
        String temp = "";
        for(int i = 0; i < num.length(); i++){
            if(temp.indexOf(Character.toString(num.charAt(i))) < 0){
                temp += num.charAt(i);
                //System.out.println("Temp = " + temp);

            }
        }
        return temp.length();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DissimiilarNumber ob = new DissimiilarNumber();

        System.out.print("Enter number: ");
        String num = sc.nextLine();

        System.out.println("Number of dissimilar number: " + ob.returnNumber(num));
    }
}
