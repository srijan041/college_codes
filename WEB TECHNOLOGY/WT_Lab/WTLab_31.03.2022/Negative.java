
import java.util.*;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String str) {
        super(str);
    }
}

public class Negative {

    void processInput() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try {
            if (num < 0)
                throw new NegativeNumberException("Number is negative");
            else
                System.out.print((double) num);
        } catch (NegativeNumberException nne) {
            System.out.println(nne);
        }
    }

    public static void main(String[] args) {
        Negative n = new Negative();
        n.processInput();
    }

}
