import java.util.*;
public class SmallestLargest {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(("Enter number: "));
        String num = sc.nextLine();

        int[] arr = new int[num.length()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(Character.toString(num.charAt(i)));
        }

        int smallest = arr[0];
        int largest = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest)
                smallest = arr[i];
            if(arr[i] > largest)
                largest = arr[i];
        }

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}
