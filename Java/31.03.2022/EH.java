
// read a set of integer. whwnever it is a prime number, it will throw an exception

import java.util.*;

class PrimeNumberException extends Exception {
    public PrimeNumberException(String s) {
        super(s);
    }
}

public class EH {

    void checkPrime(int n) {
        for (int i = 3; i <= n; i++) {
            if (n % i == 0)
                return;

        }
        try {
            throw new PrimeNumberException(n + " is a prime number");

        } catch (PrimeNumberException pne) {
            System.out.println(pne);
        }
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers: ");

        while (true) {
            checkPrime(sc.nextInt());
        }

    }

    public static void main(String[] args) {
        EH eh = new EH();
        eh.input();
    }

}
